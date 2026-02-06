package Arrays;

public class equilibriumIndex {

	

	    public static void main(String[] args) {

	        int[] arr = {1, 3, 5, 2, 2};
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {

	            int leftSum = 0;
	            int rightSum = 0;

	          
	            for (int j = 0; j < i; j++) {//index i=0 j=0 i<0 codintion false so moving next
	                leftSum += arr[j];
	              
	            }

	           
	            for (int j = i + 1; j < n; j++) {
	                rightSum += arr[j];
	            }

	            if (leftSum == rightSum) {
	                System.out.println(i);
	                return;
	            }
	        }

	        System.out.println(-1); 
	    }
	}
//Given an array of integers, find the equilibrium index where the sum of elements on the left is equal to the sum of elements on the right.
//(If multiple exist, return the first one.)
//Copy code
//
//Input:
//[1, 3, 5, 2, 2]
//
//Output:
//2 
//An equilibrium index is an index i where:

//Sum of elements on the left of i = Sum of elements on the right of i
//index=0 left 0;right 3+5+2+2 next index 1 left 1,right 5+2+2 same like go on.....

