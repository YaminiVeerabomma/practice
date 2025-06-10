package oops;
class B{
	B(){
		System.out.println("a method");
	}
			B(int x){
			
			this();
			System.out.println(x);

		
	}
}



public class This_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(1);
		

	}

}
