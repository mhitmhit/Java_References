package notes_1;

public class AE_Lesson_StringBuilderExample {

	public static void main(String[] args) {
		// mutable. unlike Strings which are immutable
		
		
		
		String testString = "Hello " + "World";
		testString.concat("and good bye");		// does not change the string ie/ doesnt work.
		
		StringBuilder testBuilder = new StringBuilder("Hello " + "World"); 
		testBuilder.append("and good bye");
		
		
		printInformation(testString);
		printInformation(testBuilder);
		
	}
	
	public static void printInformation(String string) {
		System.out.println("String = "+ string);
		System.out.println("Length = "+ string.length());
		System.out.println(string instanceof String);
		
	}
	public static void printInformation(StringBuilder builder ) {
		System.out.println("String builder = "+ builder);
		System.out.println("Length of stringBuilder = "+ builder.length());
		System.out.println(builder.toString() instanceof String);
	}
	
}
