package notes_1;

//when no constructor is present, Java use a default no arg constructor.


public class AF_constructors {
	
	private int numberOfMethods;
	
	public AF_constructors() {
		this(8); // calls the other constructor. calling constructor within constructor. Constructor Chaining.
	}
	
	public AF_constructors(int numberOfMethods) {
		this.numberOfMethods = numberOfMethods;
		
	}

	// can use toString method to print state of our object. toString must be added to Object Class using Add Menu.
	// this will print below when using system.out.print with object passed in.
	@Override
	public String toString() {
		return "constructors [numberOfMethods=" + numberOfMethods + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
