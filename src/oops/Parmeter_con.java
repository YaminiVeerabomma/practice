package oops;

public class Parmeter_con {
	int no;
	String name;
	Parmeter_con(int no,String name){
		this .no=no;
		this.name=name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parmeter_con pc=new Parmeter_con(1,"yamini");
		System.out.println(pc.no+" "+pc.name);

	}

}
//A constructor that takes arguments.
//
//Used to assign custom initial values when the object is created.