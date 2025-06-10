package string;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=1;i<=n;i++) {
			
			if(i%3==0&&i%5!=0) {
				System.out.println("fizz");
			}
			 else if(i%5==0&&i%3!=0) {
				 System.out.println("buzz");	
			}
			 else if(i%3==0&&i%5==0) {
				 System.out.println("fizzbuzz");
			 }
			 else {
				 System.out.println(i);
			 }
		}

	}

}
