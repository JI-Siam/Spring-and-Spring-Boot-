package com.Udemy.SpringBoot.learn_jpa_and_hibernate.course.jpa;


import org.springframework.stereotype.Repository;

import com.Udemy.SpringBoot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
    @PersistenceContext
	private EntityManager entityManager;
    public void Insert(Course course) {
    	entityManager.merge(course);
    }
    public Course FindById(long id) {
    	return entityManager.find(Course.class, id) ; // to find from the database , here the object primary key is searched 
    }
    public void DeleteById(long id) {
    	Course course=entityManager.find(Course.class, id);
    	entityManager.remove(course);
    }
	
}
