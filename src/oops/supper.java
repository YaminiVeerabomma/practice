package oops;
class birds{ 
	String color="red";
}
class pickchu extends birds{    
	String color="white";
	void printcolor() {
	System.out.println(color);    
    System.out.println(super.color);
	}
}

public class supper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pickchu p=new pickchu();
		p.printcolor();

	}

}
//super can be used to refer to the immediate parent class instance variable