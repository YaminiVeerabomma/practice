package oops;
class laddu{
	laddu(){
	System.out.println("laddus");
	}
}
class mothichur extends laddu{
mothichur(){
	super();
	System.out.println("mothichur laddu");
}
}
public class superClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mothichur m=new mothichur();

	}

}
//super() can be used to invoke the immediate parent class constructor