package oops;

public class This {
	   
	      int value = 10;

	      public void value() {
	          int value = 20;
	          System.out.println("Value: " +value); 
	          System.out.println("Value: "+this.value);
	      }
	  
public static void main(String[] args) {
	This t=new This();
	  t.value();

	
}
}