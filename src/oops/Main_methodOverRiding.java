package oops;

class  fragrance {
    void displayDetails() {
        System.out.println("This is a fragrance product.");
    }
}

class Perfume extends  fragrance {
    // Overriding the parent class method
    @Override
    void displayDetails() {
        System.out.println("This is a perfume product.");
    }
}

public class Main_methodOverRiding {
    public static void main(String[] args) {
    	fragrance p = new fragrance();
        p.displayDetails(); 
        Perfume pf = new Perfume();
        pf.displayDetails(); 
   
        fragrance ref = new Perfume();
        ref.displayDetails(); 
    }
}

//Method Overriding means redefining a method from the parent class in the child class using the same name,
//parameters, and return type.