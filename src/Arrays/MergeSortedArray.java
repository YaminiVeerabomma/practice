package Arrays;
import java.util.Arrays;
import java.util.*;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums1= {1};
//		int[] nums2= {};
//		int m=1;
//		int n=0;
		int[] nums1= {5,7,8,0,0,0};
		int[] nums2= {2,3,6};
		int m=3;
		int n=3;
		//copy all elements in nums2 into the nums1 position at the end
		for(int i=0;i<nums2.length;i++) {
			nums1[m]=nums2[i];
			m++;
		}
		//print nums1 without sort
			System.out.println("after"+" "+Arrays.toString(nums1));
		
		//sort the nums after copy elemts in nums1
		Arrays.sort(nums1);
		//print after sort nums1
			System.out.println("before"+" "+Arrays.toString(nums1));
		
		

	}

}
//Pointer    TimeComplxity		SpaceComplexity
//1				O(n)					O(n)