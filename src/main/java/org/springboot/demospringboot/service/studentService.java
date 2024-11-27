package org.springboot.demospringboot.service;

import org.springboot.demospringboot.model.Student;
import java.util.List;

public interface studentService {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student student);
    void delete(int id);
    int deleteAll();
}
