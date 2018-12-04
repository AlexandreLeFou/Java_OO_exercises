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
     student.setName("ΚςΣΤΑS");
     student.setCourse("bEROUKAS");
     student.setFee(400d);
     studentRepository.save(student); //will create a db record via creation of a insert command
      //student = studentRepository.findById(student.getId()).orElse(null);
      student = studentRepository.findById(2l).orElse(null);
      //update a value
      student.setName("Alexandros");
      student.setCourse("Γαζης");
       student.setFee(12l);
      //save inserts of updates values if the value already exists it shall update it
       studentRepository.save(student); //will create a db record via creation of a insert command
        System.out.println("\n Nea 2η εγγραφη =========\n"+student+"\n=========\n");
        //https://stackoverflow.com/questions/44101061/missing-crudrepositoryfindone-method
        //delete the 2st record
        //student.setId(1l);
        studentRepository.deleteById(2L);
               // delete(student);

    }

  /*  @Test
    public void testFindStudentById(){
        Student student = new Student();
        //https://stackoverflow.com/questions/44101061/missing-crudrepositoryfindone-method
        student = studentRepository.findById(student.getId()).orElse(null);
        System.out.println("\n=========\n"+student+"\n=========\n");
    } */
}
