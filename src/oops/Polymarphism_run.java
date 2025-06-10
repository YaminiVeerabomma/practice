package oops;
class calculation
{
	int add(int a,int b) {
		
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
}




public class Polymarphism_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculation c=new calculation();
 System.out.println(c.add(5, 2));
System.out.println(c.add(2.2,4.0));
	}

}
//achives the overloading 
//same methods and different paramaters in a single class 
//is called the overloading