package www.multithreading;
import java.lang.Runnable;
class MyRunnable implements Runnable {
    public void run() {
    	try {
        System.out.println( 
        		"Runnable thread is running..."+ Thread.currentThread().getId());
    	}
    	catch(Exception e) {
    		System.out.println("exception is accured");
    	}
    }
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=0;i<=n;i++) {
	
		 Thread t1 = new Thread(new MyRunnable());
	        t1.start();
		}
	}

}
