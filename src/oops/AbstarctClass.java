package oops;
abstract class Animal{
	 void sound(){
		 System.out.println(" sounds!..");
		
	}
}
	  class Dog{
		void sound() {
			System.out.println(" bow bow!..");	
		}
}
	  class cat{
	void sound() {
		System.out.println("meow meow!..");
	}
}
public class AbstarctClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Dog  d=new Dog();
		d.sound();
		cat c=new cat();
		c.sound();
		
		

	}

}
