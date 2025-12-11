package oops;

public class MethodOverLoading {
	public void m1() {
		System.out.println(" zero arg");
	}
	public void m1(int i) {
		System.out.println("parmeter arg :"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading MO=new MethodOverLoading();
		MO.m1();
		//MO.m1(5);
	}

}
//Method Overloading means defining multiple methods in the same class with the same name but different parameters
//(number, type, or order of arguments).