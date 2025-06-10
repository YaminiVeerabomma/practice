package Arrays;
import java.util.*;

public class MinSizeSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,2,4,3};
		int target=7;
//		int[] arr= {1,4,4};
//		int target=4;
//		int[] arr= {1,1,1,1,1,1,1,1};
//		int target=11;
		
		int n=arr.length;//length of array
		
		int minLength = Integer.MAX_VALUE;//assume minlength
		//itarate start to end
		for(int i=0;i<n;i++) {
		
			for(int j=i;j<n;j++) {
				int sum=0;
				//create list collection for store the sum is equal to the target elements
				List<Integer> list=new ArrayList<Integer>();
				for(int k=i;k<=j;k++) {
					//System.out.print(arr[k]);
					list.add(arr[k]);
					sum=sum+arr[k];
					}
				//System.out.print(" "+sum);
				//System.out.println();
				
				if(sum>=target) {//comapiring target
					if(list.size()<minLength) {//find min length of list
						minLength=list.size();
					}
					
					
				}
				
			}
			
		}
		if(minLength==Integer.MAX_VALUE) {//in case length is not fpund we print 0
			System.out.println("0");
			return;
		}
		System.out.println(minLength);
		
	}

}
//Given an array of positive integers nums and a positive integer target,\
//return the minimal length of a subarray whose sum is greater than or equal to target.
//If there is no such subarray, return 0 instead.

//Example 1:
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Example 2:
//
//Input: target = 4, nums = [1,4,4]
//Output: 1
//Example 3:
//
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0
 // Pointers      TimeComplexity      SpaceComplexity
//   2					O(n)			O(1)