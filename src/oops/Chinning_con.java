package oops;

public class Chinning_con {
	Double price;
	String name;
	Chinning_con(){
		this("Default con", 50.0);
		
		
		System.out.println("default con");
	}
	Chinning_con(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println(name + " - $" + price);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinning_con chainc=new Chinning_con();
       chainc.display();
	}

}
//Constructor chaining is the process of calling one constructor from
//another constructor in the same class or from a superclass.