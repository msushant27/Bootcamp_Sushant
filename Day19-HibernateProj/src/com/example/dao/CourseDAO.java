package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class CourseDAO {

    public void save(EntityManagerFactory managerFactory) {

        Course course1 = new Course("Chemistry", 25, 7800.00);
        Course course2 = new Course("Maths", 22, 7800.00);
        Course course3 = new Course("Physics", 28, 4800.00);
        Course course4 = new Course("Biology", 24, 6700.00);
        Course course5 = new Course("English", 22, 5800.00);


        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);
        entityManager.persist(course4);
        entityManager.persist(course5);
        transaction.commit();

        entityManager.close();
    }


    public void read(EntityManagerFactory managerFactory) {
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class, 3);
        System.out.println(course.toString());
        transaction.commit();
        entityManager.close();
    }

    public void update(EntityManagerFactory managerFactory) {
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class, 3);
        System.out.println(course.toString());
        course.setTitle("Mechanics");
        transaction.commit();
        entityManager.close();
    }

    public void delete(EntityManagerFactory managerFactory) {
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class, 3);
        entityManager.remove(course);
        transaction.commit();
        entityManager.close();
    }
}

