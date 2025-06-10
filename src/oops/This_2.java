package oops;
class A{    
void m(){
	System.out.println("hello m");
	}    
void n(){    
System.out.println("hello n");    
   
this.m();    
}    
}  
public class This_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();    
		a.n();    
		 

	}

}
