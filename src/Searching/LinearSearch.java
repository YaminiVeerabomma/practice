package Searching;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4, 2, 7, 1, 9};
		int n=arr.length;
		int target=0;
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==target) {
				flag=true;
				System.out.println("ele is fount at the position:" +i);
				
			}
			
		}
			if(flag==false) {
			System.out.println("element is not  found");
			}
		
	}

}
//A linear search, also known as a sequential search, 
//is a simple algorithm that checks each item in a list in order until a match is found. 
//It's often used to search an unordered list. 
