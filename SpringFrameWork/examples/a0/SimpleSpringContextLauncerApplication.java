package com.Udemy.SpringFrameWork.examples.a0;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class YourBusinessClass{
	
	// @Autowired  // Field Injection 
	Dependency1 dependency1 ;
	Dependency2 dependency2;
	
	
	 // @Autowired  // Constructor Injection (Autowired not mandatory, works without this also)
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	

     @Autowired // Setter Injection 
	public void setDependency1(Dependency1 dependency1) {
    	 	System.out.println("Woriking 1");
		this.dependency1 = dependency1;
	}
     
    

    @Autowired // Setter Injection 
	public void setDependency2(Dependency2 dependency2) {
    	System.out.println("Woriking 2");
		this.dependency2 = dependency2;
	}
	
	
	
	
	
}
@Component
class Dependency1{
	
}

@Component

class Dependency2{
	

}

@Configuration
@ComponentScan

public class SimpleSpringContextLauncerApplication {
	

	public static void main(String[] args) {
		
		
		var context=new AnnotationConfigApplicationContext(SimpleSpringContextLauncerApplication.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}


