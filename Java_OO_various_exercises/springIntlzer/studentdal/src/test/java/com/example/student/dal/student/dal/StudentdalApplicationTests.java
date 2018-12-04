package com.example.student.dal.student.dal;

import com.example.student.dal.student.dal.entitities.Student;
import com.example.student.dal.student.dal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

    /*@Test
    public void contextLoads() {
    }
*/

    @Autowired //create an instance of this interface at runtime
    private  StudentRepository studentRepository;
    @Test
    public void testCreateStudent(){
     Student student = new Student();
     student.setName("John");
     student.setCourse("Java Web Services");
     student.setFee(30d);
     studentRepository.save(student); //will create a db record via creation of a insert command

    }

   /* @Test
    public void testFindStudentById(){
        Student student = studentRepository.findOne(1l);
        System.out.println(student);
    } */
}
