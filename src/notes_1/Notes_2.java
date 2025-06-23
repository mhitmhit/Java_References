package notes_1;

public class Notes_2 {
//	 Abstract classes: can be used in a concrete class by getting extended. a concrete class can inherit only one abstract class.
//		abstract class can have both abstract and non-abstract methods.
//		Abstract methods have no code, the code must be written in each child class. Every vehicle accelerates in a different way, 
//		so there’s little point writing code for the accelerate() method in the Vehicle class. By leaving it abstract we can write car 
//		specific code in a Car child class and plane specific code in a Plane child class.

//interface: a class can inherit from multiple interfaces.
//		3 types of methods:
//		Abstract, default & static
//		Methods are implicitly abstract when no modifier is used
//		Abstract methods have no body
//		All methods are implicitly public 
//		All attributes are implicitly public, final and static
//		Don’t have constructors
//		Can’t be instantiated 

	
// create an interface:
	public interface Chargeable {

		void charge (double amps);

		default void connectToUsb() {
			// code to connect to usb
		}

		static double calculateWatts(double amps, int volts) {
			return amps * volts;
		}

	}
// create a second interface:	
	public interface Chargeable1 {

		void charge (double amps);

		default void connectToUsb() {
			// code to connect to usb
		}

		static double calculateWatts(double amps, int volts) {
			return amps * volts;
		}

	}

// implement interface	
	public class Tablet implements Chargeable, Chargeable1 {
		
		 public void charge(double amps){
			// code implementing the method 
		 }

		@Override
		public void connectToUsb() {
			// TODO Auto-generated method stub
			Chargeable.super.connectToUsb();
		}
	}
	
	
}
