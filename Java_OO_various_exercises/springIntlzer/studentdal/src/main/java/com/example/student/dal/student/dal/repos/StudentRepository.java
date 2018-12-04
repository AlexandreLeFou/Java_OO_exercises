package com.example.student.dal.student.dal.repos;

import com.example.student.dal.student.dal.entitities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{

    //<type of calss, Type of the Id in student>
    //class for crud operation on this entity
}
