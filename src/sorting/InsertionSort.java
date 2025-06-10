package sorting;
import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,3,2,10,12,1,5,6};
		int n=arr.length;
		for(int i=1;i<n;i++)
		  {
			  int key=arr[i];
			  int j=i-1;
			  while(j>=0&&arr[j]>key)
			  {
				  arr[j+1]=arr[j];
			      j=j-1;
			  }
			  arr[j+1]=key;
			  
		  }
		  	
		System.out.println(Arrays.toString(arr));

	}

}
