package oops;

class Shape{
	void draw() {
		System.out.println("drawing");
		
	}
}
	class Circle extends Shape{
		void draw() {
			System.out.println("drawing circle");	
		}
		void design() {
			System.out.println("design");
		}
	}
	class Rectangle extends Shape{
		void draw() {
		System.out.println("drawing  rectangle");
		}
		
	}

public class Polymarphism_compile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
        shape.draw();


        Circle c= new Circle();
        c.draw();
        c.design();

  
        Rectangle r= new Rectangle();
        r.draw();
	}

}
// achives the overriding 
//differnt class and same method name is called the overriding