package oops;


abstract class Vehicle {
    abstract void speed();
    abstract void getspeed();
}

interface Machine {
    default void speed() {
        System.out.println("machine speed");
    }
}

class Car1 extends Vehicle implements Machine
{
		public void speed() {
        System.out.println("car speed");
    }


	void getspeed() {
		 System.out.println("getspeed");
		
	}
}

public class MainEx {
    public static void main(String[] args) {
        new Car1().speed(); // Corrected line
        //new Car1().getspeed();
    }
}
