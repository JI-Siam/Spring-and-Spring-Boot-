package com.Udemy.SpringFrameWork.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PacManGame implements GamingConsole{
	public void up() {
		System.out.println("move forward");
	}
	public void down() {
		System.out.println("go back");
	}
	public void left() {
		System.out.println("move left");
	}
	public void right() {
		System.out.println("move right");
	}

}
