package Lamda_Expresion;


interface SinglePar{
	void Value1(int x);
}


public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglePar sp= x->{
			System.out.println(" Single argument : "+x);
		};  
		sp.Value1(2);

	}

}
