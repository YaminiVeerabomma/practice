package Arrays;
import java.util.*;

public class SearchInsertPostion {
	public int searchInsert(int[] nums, int target) {
	int n = nums.length;
    int low = 0;
    int high = n - 1;
//binary search
    while (low <= high) {
    	//find mid value 
        int mid = ((low + high) / 2);
        //compaire mid and target
        if (nums[mid] == target)
        	{return mid;
        	}
        //mid is greater the we dec the start
        else if (nums[mid] > target) {
            high = mid - 1;
        } else {//else end will be increased
            low = mid + 1;
        }
    }

    return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,5,6};
		int target=7;
		
		SearchInsertPostion SI=new SearchInsertPostion();
		int result=SI.searchInsert(nums,target);
		System.out.println(result);
      

      
    }
}
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, 
//return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
//Pointers      TimeComplexity       SpaceComplexity
//   2 				O(log n)			O(n)