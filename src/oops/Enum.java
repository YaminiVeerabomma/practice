package oops;

public class Enum {
	
		enum Level {
		    LOW,
		    MEDIUM,
		    HIGH
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level myVar = Level.MEDIUM; 
	    System.out.println(myVar);
	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	  
	}  
	}
