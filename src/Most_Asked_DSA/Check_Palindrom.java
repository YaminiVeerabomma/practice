package Most_Asked_DSA;

public class Check_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madama";
		int n=str.length();
		boolean isPalindrome=true;
		for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
		if(isPalindrome) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
			
		
		
	}

}
