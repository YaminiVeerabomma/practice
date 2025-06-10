package www.multithreading;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizz f=new fizz();
		buzz b=new buzz();
		fizzbuzz fb=new fizzbuzz();

	}

}
class fizz extends Thread{
	public void fizz() {
		System.out.println("fizz");
	}
}
class buzz extends Thread{
	public void buzz() {
		System.out.println("buzz");
	}
}
class fizzbuzz extends Thread{
	public void fizzbuzz() {
		System.out.println("fizzbuzz");
	}
}
