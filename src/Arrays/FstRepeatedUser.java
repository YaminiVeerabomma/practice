package Arrays;

import java.util.*;

public class FstRepeatedUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"yamini","pavani","bharth","arjun","yamini"};
		int n=names.length;
		HashSet<String> set=new HashSet<>();
		String FirstNonRepeting = null;
		for(int i=0;i<n;i++) {
			if(!set.contains(names[i])) {
				set.add(names[i]);
			}
			else {
				FirstNonRepeting=names[i];
			}
			
		}
		
    System.out.println(FirstNonRepeting); 
	}

}
