package com.example.student.dal.student.dal;

import com.example.student.dal.student.dal.entitities.Student;
import com.example.student.dal.student.dal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.String.valueOf;

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
     student.setName("JohnyMan");
     student.setCourse("Java Web New");
     student.setFee(32d);
     studentRepository.save(student); //will create a db record via creation of a insert command

    }

    @Test
    public void testFindStudentById(){
        Student student = new Student();
        //https://stackoverflow.com/questions/44101061/missing-crudrepositoryfindone-method

        student = studentRepository.findById(1l).orElse(null);
        System.out.println("\n=========\n"+student+"\n=========\n");
    }
}
