package notes_2_Comparator_Example;

public class Student2 {
	 
    // Attributes of a student
    public int rollno;
    public String name, address;
 
    // Constructor
    public Student2(int rollno, String name, String address)
    {
        // This keyword refers to the current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Method of Student class
    // To print student details in main()
    public String toString()
    {
        // Returning attributes of Student
        return this.rollno + " " + this.name + " " + this.address;
    }
}
