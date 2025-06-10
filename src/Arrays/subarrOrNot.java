package Arrays;
import java.util.*;
import java.util.HashSet;

public class subarrOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a= {11,1,13,21,3,7};
//		int[] b= {11,3,7,10};
		int[] a= {1,2,3,4,5,6};
		int[] b= {1,2,4};
//		int[] a= {10,5,2,23,19};
//		int[] b= {19,5,3};
		
		
		Set<Integer> set=new HashSet<>();
	
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		for(int i=0;i<b.length;i++) {
			if(!set.contains(b[i])) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
		
		

	}

}
