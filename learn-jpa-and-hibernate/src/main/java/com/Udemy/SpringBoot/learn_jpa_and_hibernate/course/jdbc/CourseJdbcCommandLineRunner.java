package com.Udemy.SpringBoot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
// In Spring JDBC, CommandLineRunner is used for executing code once the Spring Boot application has started.
	//It’s often utilized for running database operations such as inserting, updating, 
	//or querying data when the application is initialized.
	
	@Autowired
	private CourseJdbcRepository courseJdbcRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseJdbcRepository.Insert(new Course(1,"Java","AIUB"));
		courseJdbcRepository.Insert(new Course(2,"C++","AIUB"));
		courseJdbcRepository.Insert(new Course(3,"Python","AIUB"));
		courseJdbcRepository.Delete(1);
		System.out.println(courseJdbcRepository.findById(3));
		System.out.println(courseJdbcRepository.findById(2));
		
	}

}
