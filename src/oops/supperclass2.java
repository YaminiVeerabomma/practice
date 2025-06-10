package oops;
class fruit{
	void color() {
		System.out.println("fruits clr");
	}
	
}
class apple extends fruit{
	void color() {
		System.out.println("red color");
		
	}
	void tast() {
	   super.color();
		
	}
	
}

public class supperclass2 {
	public static void main(String[] args) {
		apple a=new apple();
		a.tast();
		
	}

}
// used to invoke the immediate parent class method.