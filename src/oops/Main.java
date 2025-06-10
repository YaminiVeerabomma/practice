package oops;

class Parent{
	int x=10;
	void dark() {
	System.out.println(" dark");
	}

}
class Child extends Parent{
	
	int x=20;
	void dark() {
		System.out.println(" hello");	
	}
	}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		 System.out.println(p.x);
		 p.dark();
		 Child c=new Child();
		 System.out.println(c.x);
		 c.dark();
		

	}

}
