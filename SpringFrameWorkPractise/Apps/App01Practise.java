package SpringFrameWorkPractise.Apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import SpringFrameWorkPractise.Vehicle.Bus;
import SpringFrameWorkPractise.Vehicle.Car;
import SpringFrameWorkPractise.Vehicle.DrivingConsole;
import SpringFrameWorkPractise.Vehicle.Truck;
import SpringFrameWorkPractise.Vehicle.VehicleOperating;

@Configuration
@ComponentScan("SpringFrameWorkPractise.Vehicle")  // scanning for components and creating object whereever there is a need of that component

//in this example Car and VehicleOperating are components 
// in the 34th line there is a call for VehicleOperating class start method , for that there is  a need of instance of it , 
// so spring is automatically creating the object of that class , again there is a need of dc or a vehicle 
// as Car is a component , spring automatically creates a instance of Car and autowires it to the dc and VehicleOperating Class

// now the question comes , what if there is multiple candidate of components like Car,Bus,Truck
// it will throw an error as there is multiple components available and spring doesn't know which one to use 
//for @primary & @qualifier notations can be used , we can make a component primary and add qualifers to others so whenever any specific needed 
// we can call them using the qualifiers and for no preference the primary one will be called 
public class App01Practise {
	
	public static void main(String[] args) {
		
		
		// this is conventional method 
//		
//		var vehicle=new Truck();
//		var operating= new VehicleOperating(vehicle);
//		operating.start();
  
		 // lets try the spring way 
		
		
		try(var context = new AnnotationConfigApplicationContext(App01Practise.class)){
			context.getBean(VehicleOperating.class).start();
			                                               // the object are automatically created by 
			                                               // spring, spring is creating the instances of the
		                                                   //component classes , spring is scanning for components
			                                               //wherever there is a need of that component spring is automatically
			                                               //creating the object 
		}

	}

}
