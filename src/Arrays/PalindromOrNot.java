package Arrays;

public class PalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		
		int duplicate = num;
		int reverse = 0;

		while (num > 0) {
		    int digit = num % 10;//it store the last digit
		    reverse = reverse * 10 + digit;
		    num = num / 10;//it gives the remaiing degits 
		}

		if (duplicate == reverse) {
		    System.out.println("Palindrome");
		} else {
		    System.out.println("Not Palindrome");
		}

		
	}

}
