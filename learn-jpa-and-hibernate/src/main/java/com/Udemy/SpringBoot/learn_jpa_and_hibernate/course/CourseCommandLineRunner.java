package com.Udemy.SpringBoot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Udemy.SpringBoot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
// In Spring JDBC, CommandLineRunner is used for executing code once the Spring Boot application has started.
	//It’s often utilized for running database operations such as inserting, updating, 
	//or querying data when the application is initialized.
	
//	@Autowired
//	private CourseJdbcRepository courseJdbcRepository;
	
	@Autowired
	private CourseJpaRepository courseJpaRepository ; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseJpaRepository.Insert(new Course(1,"Java","AIUB"));
		courseJpaRepository.Insert(new Course(2,"C++","AIUB"));
		courseJpaRepository.Insert(new Course(3,"Python","AIUB"));
		courseJpaRepository.Insert(new Course(4,"AWS","BUET"));
		courseJpaRepository.DeleteById(1);
		System.out.println(courseJpaRepository.FindById(3));
		System.out.println(courseJpaRepository.FindById(2));
	}

}
