package org.springboot.demospringboot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.demospringboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO{

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentDaoImpl.class);

    private EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("from Student", Student.class).getResultList();

//        TypedQuery<Student> query = entityManager.createQuery("from Student ",Student.class);
//        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        return entityManager.createQuery("from Student where lastName=:lastName", Student.class).setParameter("lastName", theLastName).getResultList();

//        TypedQuery<Student>query=entityManager.createQuery("from Student where lastName=:lastName", Student.class);
//        query.setParameter("lastName", theLastName);
//        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);

//      int numRowsUpdated = entityManager.createQuery("from Student where id=:id", Student.class).executeUpdate();
//        LOGGER.info(numRowsUpdated + " rows updated");
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAll() {

        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }
}
