package Arrays;

import java.util.*;

public class Prefix_sum_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		int sum=0;
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<n;i++) {
		
			sum=sum+arr[i];
			l.add(sum);
			
					
		}
		System.out.println(l);

	}

}
//public class Prefix_sum_Arr {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {1,2,3,4,5};
//		int n=arr.length;
//		for(int i=0;i<n;i++) {
//			int sum=0;
//			for(int j=0;j<=i;j++) {
//				System.out.print(arr[j]+",");
//				sum=sum+arr[j];
//			}
//			System.out.print( "sum:"+sum);
//			System.out.println();
//			
//					
//		}
//
//	}
//
//}
