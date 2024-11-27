package org.springboot.demospringboot.service;

import org.springboot.demospringboot.model.Student;

import java.util.List;

public class studentServiceImpl implements studentService {
    @Override
    public void save(Student student) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        return List.of();
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
