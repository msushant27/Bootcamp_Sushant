package com.example.client;

import com.example.dao.CourseDAO;
import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
        CourseDAO courseDAO = new CourseDAO();
        courseDAO.save(managerFactory);
        courseDAO.read(managerFactory);
        courseDAO.update(managerFactory);
        courseDAO.read(managerFactory);
        courseDAO.delete(managerFactory);

        managerFactory.close();
    }
}