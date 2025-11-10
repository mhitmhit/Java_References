package notes_1;

import notes_1.Example_Files.Animal;
import notes_1.Example_Files.Dog;

// a class can extend one class only

public class AL_Inheritance {	

	public static void doAnimalStuff(Animal animal, String speed) {
		
		// use example files Animal and Dog
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("--------");
		
	}
	
	public static void main(String[] args) {		
		
		Animal animal = new Animal("Generic Animal", "Huge", "400");
		doAnimalStuff(animal, "slow");
		
		Dog dog = new Dog();
		doAnimalStuff(dog, "fast");
		
	}
	
}


