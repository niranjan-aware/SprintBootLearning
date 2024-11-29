package org.springboot.demospringboot;

import org.springboot.demospringboot.dao.StudentDAO;
import org.springboot.demospringboot.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
public class DemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner ->{
//            createStudent(studentDAO);

//            readStudent(studentDAO);

//            queryStudent(studentDAO);

//            queryStudentByLastName(studentDAO);

//            updateStudent(studentDAO);
//            queryStudent(studentDAO);

//            deleteStudent(studentDAO);
//            queryStudent(studentDAO);
        };
    }

//    private void deleteStudent(StudentDAO studentDAO) {
//        Student student =
//    }

    private void updateStudent(StudentDAO studentDAO) {
        Student student = studentDAO.findById(2);
        student.setFirstName("Hrishikesh");
        student.setEmail("hrishikesh@gmail.com");
        studentDAO.update(student);
    }

    private void queryStudentByLastName(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Aware");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void createStudent(StudentDAO studentDAO) {
        Student student = new Student("Niranjan","Aware","niroba.aware.26@gmail.com");
        studentDAO.save(student);
    }

    private void readStudent(StudentDAO studentDAO) {
        Student student=studentDAO.findById(1);
        System.out.println("Student with ID 1 =>"+student);
    }

    private void queryStudent(StudentDAO studentDAO) {
        List<Student> students=studentDAO.findAll();
        for(Student student:students){
            System.out.println(student);
        }
    }
}
