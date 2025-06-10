package oops;
class Write{
	 static void f1() {
		System.out.println("deside to write ");
	}
}
class Story extends Write {
	 static void f1() {
		System.out.println(" write the story ");
	}
}

public class Method_Hiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Write s=new Write();
		s.f1();
		Write s1=new Story();
		s.f1();
		

	}

}
