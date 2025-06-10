package oops;

public class ConstarcterOverLoading {
	ConstarcterOverLoading (String s){
		System.out.println(s);
	}
	ConstarcterOverLoading (int age,String name){
		System.out.println(
	            "Constructor with two arguments: "
	            + " String and Integer: " + name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstarcterOverLoading  conOvld=new ConstarcterOverLoading ("hello");
		ConstarcterOverLoading  conOvld1=new ConstarcterOverLoading (10,"hello");
	}

}
