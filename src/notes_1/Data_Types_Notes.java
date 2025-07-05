package notes_1;

public class Data_Types_Notes {
	
	public static void main(String[] args) {
//	adding bytes together
//	add bytes together possible ? yes, pay attention to operation value if it fits in a byte
	byte number1 = 127;
	byte number2 = 127;
	int number3 = number1 + number2;
	
//	System.out.println(number3);
	
//	use underscore to help with readability of large numbers
	double numb1 = 1_000.323;
//	System.out.println(numb1);

	
//	Wrappers
	int IntegerWrapper_myValue = Integer.MAX_VALUE;
	byte ByteWrapper_myValue = Byte.MAX_VALUE;
	
//	System.out.println(IntegerWrapper_myValue);

//	System.out.println(ByteWrapper_myValue);
	
	String currentYear = "2022";
	String userDateOfBirth = "1999";
	
	System.out.println("Age = " + (Integer.parseInt(currentYear) - Integer.parseInt(userDateOfBirth)));
	}
	
}
