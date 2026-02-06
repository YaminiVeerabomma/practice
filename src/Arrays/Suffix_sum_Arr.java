package Arrays;

import java.util.*;

public class Suffix_sum_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		int sum=0;
		List<Integer> l=new ArrayList<>();
		for(int i=n-1;i>=0;i--) {
			sum=sum+arr[i];
			l.add(sum);
			
		}
		System.out.println(l);
			

	}

}
//Public class Safix_sum_Arr {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {1,2,3,4,5};
//		int n=arr.length;
//		for(int i=n-1;i>=0;i--) {
//			int sum=0;
//			for(int j=n-1;j>=i;j--) {
//				System.out.print(arr[j]+",");
//				sum=sum+arr[j];
//			}
//			System.out.print( "sum:"+sum);
//			System.out.println();
//			
//		}
//
//	}
//
//}
