package Lamda_Expresion;

interface ZeroPar{
	void Value();
}



public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroPar zp=()->{
			System.out.println(" zero argument");
		};
		zp.Value();

	}

}
