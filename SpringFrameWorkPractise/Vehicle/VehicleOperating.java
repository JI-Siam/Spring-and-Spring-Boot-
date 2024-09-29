package SpringFrameWorkPractise.Vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// as there is multiple candidates , for the qualifer annotation only this specific component will be autowired even if there 
// is primary component 
public class VehicleOperating {
	
	private DrivingConsole dc;
	
	public VehicleOperating(@Qualifier("BusQualifier") DrivingConsole dc ) {
		this.dc=dc ;
	}
	
	public void start() {
		System.out.println(dc);
		dc.Break();
		dc.MaxAccelerate();
	}

}
