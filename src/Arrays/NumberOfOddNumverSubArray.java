package Arrays;
import java.util.*;
public class NumberOfOddNumverSubArray {
	public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 1, 1};
	        int k = 3;
//	        int[] nums= {2,4,6};
//	        int k=1;
//	        int[] nums= {2,2,2,1,2,2,1,2,2,2};
//	        int k=2;
	        int n = nums.length;
	     
	        int count = 0; // To keep track of the number of subarrays with exactly k odd numbers

	        // Iterate over all possible subarrays
	        for (int i = 0; i < n; i++) {
	            int oddcount = 0; // Count of odd numbers in the current subarray

	            for (int j = i; j < n; j++) {
	                // If the number is odd, increment the oddcount
	                if (nums[j] % 2 != 0) {
	                    oddcount++;
	                }

	                // If the count of odd numbers in the subarray equals k, increment result count
	                if (oddcount == k) {
	                    count++;
	                }

	                // If oddcount exceeds k, break early (optimization)
	                // Optional: Uncomment this if only subarrays with **exactly** k odds are counted
	                // if (oddcount > k) break;
	            }

	        
	        }

	        // Output the total count of valid subarrays
	        System.out.println(count);
	    }
	}