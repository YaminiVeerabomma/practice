package Arrays;
import java.util.*;
public class KSizeSubArrIndex {
	public static void SubArrayIndx(int[] arr,int k) {
		int n=arr.length;
		int start=0;
		int end=k-1;
		while(end<n) {
			System.out.print(start+" ");
			System.out.println(end+" ");
			start++;
			end++;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8, 9,10,11};
		int k=5; 
		
		SubArrayIndx(arr,k);
		 
		

	}

}
