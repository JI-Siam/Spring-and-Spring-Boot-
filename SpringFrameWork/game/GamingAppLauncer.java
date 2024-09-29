package com.Udemy.SpringFrameWork.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Udemy.SpringFrameWork.game")

public class GamingAppLauncer {
	

	public static void main(String[] args) {
		
		
		var context=new AnnotationConfigApplicationContext(GamingAppLauncer.class);
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	
	}
}


