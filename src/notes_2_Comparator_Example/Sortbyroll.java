package notes_2_Comparator_Example;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student2> {
	 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Student2 a, Student2 b)
    {
        return a.rollno - b.rollno;
    }
}
