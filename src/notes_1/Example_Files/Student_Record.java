package notes_1.Example_Files;

public class Student_Record {

	public record Student(String id, String name, String dateOfBirth) {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student recordStudent = new Student("123", "test name", "1980");
		
		System.out.println(recordStudent);
		System.out.println(recordStudent.name());
		
		
		
	}

}
