package www.multithreading;

public class TestMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1= new employee();
		e1.start();
		
		 manager m1 =new  manager();
		 m1.start();

	}
}
class employee extends Thread{
	 public void run() {
		 for(int i=0;i<10;i++) {
	System.out.println("hello");}
	}
}
class manager extends Thread{
	 public void run() {
		 for(int i=0;i<20;i++) {
	System.out.println("hi");}
	}
}
// extends thread 


