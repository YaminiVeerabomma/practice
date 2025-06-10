package www.multithreading;

public class TestMultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1  e1=new employee1 ();
		Thread t1=new Thread(e1 );
		
		
		manager1 m1=new manager1();
		Thread t2=new Thread(m1);
		t1.start();
		
		t2.start();
		
		

	}

}
class employee1 implements Runnable{
	 public void run() {
		 for(int i=0;i<10;i++) {
	System.out.println("hello"+Thread.currentThread().getName());}
	}
}
class manager1 implements Runnable{
	 public void run() {
		 for(int i=0;i<20;i++) {
	System.out.println("hi"+Thread.currentThread().getName());}
	}
}
