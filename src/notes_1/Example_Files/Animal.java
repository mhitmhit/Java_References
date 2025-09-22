package notes_1.Example_Files;

public class Animal {
	String type;
	String size;
	String weight;
	
	public Animal() {
		
	}
	public Animal(String type, String size, String weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	public void move(String speed) {
		System.out.println(type + " move " + speed);
	}
	public void makeNoise() {	
		System.out.println(type + " make some kind of noise");
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
}
