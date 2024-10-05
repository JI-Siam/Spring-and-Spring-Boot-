package com.Udemy.SpringBoot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // stereotype - like component  - repository is used for class which talks or directly interects with database
public class CourseJdbcRepository {
	@Autowired
  private JdbcTemplate springJdbcTemplate ; // for performing query this template is used 
 
	private static String InsertQuery=
		  """
  		
  		insert into Course(id , name , author)
  		 values(?, ? , ?);    
  		 
  		  """; 
  // putting question mark in the values indicates that values will be inputed manually
  // providing the sql query here in the text block 
  

	
	 // to perform deletion on the table of course 
  private static String DeleteQuery= 
		  """
  		delete from Course where id=?
  		  """; 
  
  private static String SelectQuery= 
		  """
  		select *from Course where id=?
  		  """; 
  
  
 
  public void Insert(Course course) {
	  springJdbcTemplate.update(InsertQuery,course.getId(), course.getName(), course.getAuthor()) ; // passing the query to the template 
	                                                      //update method can be used for insert , update and delete queries 
  }
  public void Delete(long courseId) {
	  springJdbcTemplate.update(DeleteQuery,courseId);
  }
  
  public Course findById(long id) {
	  //ResultSet-> Bean => RowMapper
	  //The method is mapping the ResultSet directly to a Course object using BeanPropertyRowMapper.
	  //BeanPropertyRowMapper in Spring JDBC automatically maps database columns to Java object properties by matching column names with field or setter method names in the Java class,

	 return springJdbcTemplate.queryForObject(SelectQuery, new BeanPropertyRowMapper<>(Course.class), id);
  }
  
}
