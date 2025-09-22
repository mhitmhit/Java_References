package notes_1.Example_Files;

public class Dog extends notes_1.Example_Files.Animal{
	String earShape;
	String tailShape;
	
	public Dog(String type, String size, String weight, String earShape, String tailShape) {
		super(type, size, weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public void move(String speed) {
		 System.out.println(type + " move" + speed);
	}	
}
