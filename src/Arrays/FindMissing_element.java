package Arrays;

import java.util.Arrays;

public class FindMissing_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 4, 6, 3, 7, 8};
		int n=arr.length;
		Arrays.sort(arr);
		
		for(int i=1;i<n;i++) {
			if(arr[i]-1!=arr[i-1]) {
			System.out.println("missingElement:" +(arr[i]-1));
			return;
			}
		}
		System.out.println("No missing elem");

	}

}
//
//public class MissingNumber {
//
//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 4, 5};
//        int n = 5;
//
//        System.out.println(findMissing(arr, n));
//    }
//
//    public static int findMissing(int[] arr, int n) {
//
//        int expectedSum = n * (n + 1) / 2;
//        int actualSum = 0;
//
//        for (int num : arr) {
//            actualSum += num;
//        }
//
//        return expectedSum - actualSum;
//    }
//}
