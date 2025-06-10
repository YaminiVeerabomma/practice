
package Lamda_Expresion;
interface multiper {
	void Value2(int x,int y);
}

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiper mp=(int x,int y)->{
			System.out.println("multiple per "+ x +" "+ y);
		};
		mp.Value2(2, 3);
	}

}
