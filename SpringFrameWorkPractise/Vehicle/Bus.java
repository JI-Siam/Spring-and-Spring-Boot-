package SpringFrameWorkPractise.Vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BusQualifier")
public class Bus implements DrivingConsole  {

	public void MaxAccelerate() {
		System.out.println("80 kmh");
	}
	public void Break() {
		System.out.println("Hydrolic");
	}
	
}


