package com.Udemy.SpringFrameWork.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class DependencyLauncerApplication {
	

	public static void main(String[] args) {
		
		
		var context=new AnnotationConfigApplicationContext(DependencyLauncerApplication.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}


