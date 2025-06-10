package string;
import java.util.*;

public class lengthOfLongPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ababab";
		int n=s.length();
		int i=n-1;
		
		
		while(i>0) {
			if (s.substring(0, i).equals(s.substring(n - i))) {
                System.out.println(i);
                return;
            }
            i--; 
        }
        System.out.println(0); 
		}
		
}

	


