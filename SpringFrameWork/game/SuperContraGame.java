package com.Udemy.SpringFrameWork.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("sit");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("shoot");
	}

}
