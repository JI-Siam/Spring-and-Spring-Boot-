package SpringFrameWorkPractise.Vehicle;

import org.springframework.stereotype.Component;

@Component
public class Truck implements DrivingConsole {
	
	public void MaxAccelerate() {
		System.out.println("60");
	}
	public void Break() {
		System.out.println("Slow");
	}
	
}

