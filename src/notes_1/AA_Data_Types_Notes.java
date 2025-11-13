package notes_1;

import java.util.ArrayList;

public class AA_Data_Types_Notes {
	
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
	String str2 = new String("1999");
	
	
	System.out.println("Age = " + (Integer.parseInt(currentYear) - Integer.parseInt(userDateOfBirth)));

// determine runtime type
	System.out.println(currentYear instanceof String);
// determine runtime type, then assign the value to syfy - syfy is a instance name
	if (userDateOfBirth instanceof String syfy){
		System.out.println("value of syfy: " + syfy);
	}
	
	System.out.println(userDateOfBirth);
	
	


//Automatic conversions
//
//    Java can automatically convert some primitive types to others and do so whenever necessary.
//    Whenever you perform a mathematical operation on two values that aren't of the same type, Java automatically converts one of them to the type of the other.
//
//Casting
//
//    Casting is the process of converting a data type to another data type.
//    This is also called type casting.
//    Casting is necessary in some situations when we receive a data type that needs to have some actions performed on it that its original form cannot handle.
//
//When working with some primitive numeric types, Java will automatically do this conversion.
//
//    This automatic conversion is supported when the types are compatible with range and precision.
//    The original data type must have a smaller size in memory (and thus be capable of holding a smaller range of values) than the target type.
//    The target type must also hold the same or greater precision past the decimal point, so that there is no data lost in the conversion.
//

	
	
	
	
	
	
	System.out.println("--------------- Wrappers Examples ---------------");
// wrappers Examples:
    // byte data type
    byte a = 1;

    // Wrapping around Byte object using valueOf()
    Byte byteobj = Byte.valueOf(a);

    // int data type
    int b = 10;

    // Wrapping around Integer object using valueOf()
    Integer intobj = Integer.valueOf(b);

    // float data type
    float c = 18.6f;

    // Wrapping around Float object using valueOf()
    Float floatobj = Float.valueOf(c);

    // double data type
    double d = 250.5;

    // Wrapping around Double object using valueOf()
    Double doubleobj = Double.valueOf(d);

    // char data type
    char e = 'a';

    // Wrapping around Character object (autoboxing)
    Character charobj = e;

    // Printing the values from wrapper objects
    System.out.println("Values of Wrapper objects (printing as objects)");
    System.out.println("Byte object byteobj: " + byteobj);
    System.out.println("Integer object intobj: " + intobj);
    System.out.println("Float object floatobj: " + floatobj);
    System.out.println("Double object doubleobj: " + doubleobj);
    System.out.println("Character object charobj: " + charobj);

    // Unwrapping objects to primitive data types
    byte bv = byteobj;
    int iv = intobj;
    float fv = floatobj;
    double dv = doubleobj;
    char cv = charobj;

    // Printing the values from primitive data types
    System.out.println("Unwrapped values (printing as data types)");
    System.out.println("byte value, bv: " + bv);
    System.out.println("int value, iv: " + iv);
    System.out.println("float value, fv: " + fv);
    System.out.println("double value, dv: " + dv);
    System.out.println("char value, cv: " + cv);

    // More about using Wrapper classes
    Integer i3 = 5000; // Autoboxing
    Integer i4 = 5000; // Autoboxing

    // i3 and i4 are reference variables pointing to different objects
    System.out.println("i3 == i4: " + (i3 == i4)); // False (different objects)
    
    // Comparing internal values using equals()
    System.out.println("i3.equals(i4): " + i3.equals(i4)); // True (same value)

    // Useful constants and methods in wrapper classes
    System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
    System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);

    // Convert String to int using parseInt()
    int age = Integer.parseInt("75");
    System.out.println("Converted age: " + age);

    // Collections such as ArrayList can only store objects, not primitives
    ArrayList<Integer> myInts = new ArrayList<>();
    myInts.add(10);
    myInts.add(1000);
    
    
    
    
    
    
	System.out.println("--------------- Object Class ---------------");
    // Object Class
//
//	Since all objects inherit from the Object class, they have at least the methods defined in the Object class:
//
//	    Object clone() - Returns a copy of this object.
//	    boolean equals(Object o) - Indicates whether this object is equal to the o object. by default it is same as == which checks memory address.
//	    void finalize() - Called by the garbage collector when the object is destroyed.
//	    Class<?> getClass() - Returns a Class object that represents this object's runtime class.
//	    int hashCode() - Returns this object's hash code. an integer representing the current instance of the class. unique identifier for the object.
//	    void notify() - Is used with threaded applications to wake up a thread that's waiting on this object.
//	    void notifyAll() - Is used with threaded applications to wake up all threads that are waiting on this object.
//	    String toString() - Returns a String representation of this object. (by default it prints the memory address)
//	    void wait() - Causes this object's thread to wait until another thread calls notify or notifyAll.
//	    void wait(long timeout) - Is a variation of the basic wait method.
//	    void wait(long timeout, int nanos) - Another variation of the wait method.


 // always override both equals() and hashCode() methods together. or neither.
//    @Override
//    public boolean equals(Object o1){
//        return true;
//    }	
//    
	
	
//	  @Override
//	  public boolean equals(Object o) {
//	      if (o == this)
//	          return true;
//	      if (!(o instanceof WrongVoucher))
//	          return false;
//	      WrongVoucher other = (WrongVoucher)o;
//	      boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
//	        || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
//	      boolean storeEquals = (this.store == null && other.store == null)
//	        || (this.store != null && this.store.equals(other.store));
//	      return this.amount == other.amount && currencyCodeEquals && storeEquals;
//	      }
    
    
    
    
    
	
	} // End of main method
	
	

}
