package Arrays;

import java.util.*;

public class CheckDuplicateArrOrNot {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,20};
		boolean flag=false;
		HashSet<Integer> s=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(s.contains(arr[i])) {
				flag=true;
				break;
			}
			else {
				s.add(arr[i]);
			}
			
		}
		System.out.println(flag);
	}

}
