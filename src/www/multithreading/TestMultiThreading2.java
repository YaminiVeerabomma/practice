package www.multithreading;
import java.lang.Runnable;
public class TestMultiThreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lamda expression
		Runnable r1=()-> {
			
			for(int i=0;i<10;i++) {	
			System.out.println("hello"+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
			}
			
		};
		Runnable r2=()-> {
			
				for(int i=0;i<5;i++) {		
			System.out.println("hi"+Thread.currentThread().getName());}
		
		};
		//anonomus class
//		Runnable r1=new Runnable() {
//			public void run() {
//			for(int i=0;i<10;i++) {	
//			System.out.println("hello"+Thread.currentThread().getName());
//			}
//			}
//		};
//		Runnable r2=new Runnable() {
//			public void run() {
//				for(int i=0;i<5;i++) {		
//			System.out.println("hi"+Thread.currentThread().getName());
//				}
//			}
//		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2,"T2");
		t1.start();
		System.out.println(t1.getState());
		try {
            t1.join(); 
            System.out.println(t1.getState());
            t1.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		//t2.start();
		System.out.println(t1.getState());
		//t1.start();// once thread excutetion is completed thread should be dead start so in this tym getting the error.

	}

}
