package Arrays;

import java.util.*;

public class Max_Product_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,2};
		int n=arr.length;
		
		Arrays.sort(arr);
		int product=arr[n-1]*arr[n-2];
		System.out.println(product);
	}

}
//Given an array of integers, find the maximum product of two elements such that their indices are different.
//Copy code
//
//Input:
//[3, 4, 5, 2]
//
//Output:
//20
//public class Max_Product_arr {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {3,4,5,2};
//		int n=arr.length;
//		int max=Integer.MIN_VALUE;
//		
//		for(int i=0;i<n;i++) {
//			int product=0;
//			for(int j=i+1;j<n;j++) {
//				product=arr[i]*arr[j];
//				max=Math.max(max, product);
//			}
//		}
//		System.out.println(max);
//		
//	}
//
//}
