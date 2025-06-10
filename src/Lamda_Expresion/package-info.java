package Lamda_Expresion;
//Object class 
//The Object class is the root class of the Java class hierarchy.
//
//Every class in Java either directly or indirectly inherits from java.lang.Object.
//
//java
//Copy
//Edit
//public class MyClass {
//    // Internally, this extends Object
//}
//📦 Location:
//Package: java.lang
//
//You don’t need to import it explicitly.
//
//🔧 Key Methods in Object Class:
//Method Signature							Purpose
//boolean equals(Object obj)	Checks logical equality between objects
//int hashCode()				Returns an integer hash code for the object
//String toString()				Returns a string representation of the object
//final Class<?> getClass()		Returns the runtime class of the object
//protected Object clone()		Creates and returns a copy of the object
//void notify()					Wakes up a thread waiting on this object’s monitor
//void wait()					Causes current thread to wait until notified
//void finalize()				Called by GC before object is destroyed (deprecated)
//
//📌 Why equals(), hashCode(), and toString() Don’t Count as Abstract in Functional Interfaces?
//Because these methods are:
//
//Already defined in Object class
//
//Automatically inherited by all classes and interfaces
//
//So, when you write:
//
//java
//Copy
//Edit
//@FunctionalInterface
//interface MyAction {
//    void run();
//    boolean equals(Object o); // This is from Object class
//}
//➡️ equals(Object o) is not considered an abstract method in this context.
//➡️ Only run() is counted, so this is still a valid functional interface.
//
//🧪 Example: Using toString() and equals() from Object
//java
//Copy
//Edit
//public class Person {
//    String name;
//
//    Person(String name) {
//        this.name = name;
//    }
//
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person p = (Person) o;
//        return name.equals(p.name);
//    }
//
//    public String toString() {
//        return "Person: " + name;
//    }
//
//    public static void main(String[] args) {
//        Person p1 = new Person("Alice");
//        Person p2 = new Person("Alice");
//
//        System.out.println(p1.equals(p2));  // true
//        System.out.println(p1);             // Person: Alice
//    }
//}
//Summary:
//Object is the superclass of all Java classes.
//
//It defines methods that every object can use.
//
//In functional interfaces, methods like equals() or toString() do not count as abstract methods because they're inherited.
//
//Let me know if you’d like a diagram or want to override some of these methods practically.

