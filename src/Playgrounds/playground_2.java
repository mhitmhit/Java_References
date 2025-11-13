package Playgrounds;

public class playground_2 {

	  public static void main(String[] args) throws CustomException {
		  
	    throwCustomException();
		  
		  
	  }
	  
	  public static void throwCustomException() throws CustomException {
		  int value = 5/0;
	  }
	}