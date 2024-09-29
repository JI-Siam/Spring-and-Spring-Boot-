package SpringFrameWorkPractise.Vehicle;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements DrivingConsole {
	
	public void MaxAccelerate() {
		System.out.println("100 kmh");
	}
	public void Break() {
		System.out.println("Hard");
	}
	
}
