package oops;

 class Vehicle1 {
	 void startEngine()
	 {
		 System.out.println("vehicle  Engine is start");
	 }

}
 class Car extends Vehicle1{
	  void drive()
	 {
		 System.out.println("drive the car");
	 }

}
 class Bike extends Vehicle1{
	 void speed() {
		 System.out.println("bike speed is high");
	 }
 }
	public class SingleInh{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.startEngine();
		//b.drive();
		b.speed();
		

	}

}

