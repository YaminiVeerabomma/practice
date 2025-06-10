package Searching;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,8,12,16,23,38,56,78,90};
		int s=0;
		int e=arr.length-1;
		int target=8;
		
		boolean flag=false;
		while(s<e) {
			System.out.println(s+" "+ e);
			int m= s+(e-s)/2;
			System.out.println("Mid "+m);
			if(arr[m]==target) {
				flag=true;
	
				break;
				//System.out.println("element is found");
			}
			if(arr[m]<target) {
				s=m+1;
			}
			else {
				e=m-1;
			}
			
		}
		
		if(flag==true) {
			System.out.println("element is  found");
		}
		else {
			System.out.println("element is not  found");
		}
	}

}
// Binary Search is a search algorithm that finds the position of a target value within a sorted array.
// Binary search compares the target value to the middle element of the array. 
//If they are not equal, the half in which the target cannot lie is eliminated and the search continues on the remaining half, 
//again taking the middle element to compare to the target value, and repeating this until the target value is found. 
//If the search ends with the remaining half being empty, the target is not in the array.
