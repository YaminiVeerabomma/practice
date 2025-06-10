package Lamda_Expresion;

@FunctionalInterface
interface MyAction {
    void run(); // Abstract method

   
    boolean equals(Object o);
}

public class TestFunctionalInterface {
    public static void main(String[] args) {
        MyAction action = () -> System.out.println("Running MyAction!");
        action.run();

        // equals() will refer to Object's implementation unless overridden
        System.out.println("Equals check: " + action.equals(action));
    }
}
//Normally, functional interfaces can have only one abstract method.

//But equals(Object), hashCode(), toString() are methods from Object class and don’t 
//count against the single abstract method rule.
