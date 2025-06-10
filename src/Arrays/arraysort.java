package Arrays;
import java.util.*;
public class arraysort {
	public int[] sortarr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j])
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
			}
		}
		}
//		for(int i=0;i<n-1;i=i+2)
//		{
//			
//				int temp=arr[i];
//				arr[i]=arr[i+1];
//				arr[i+1]=temp;
//				
//			}
			
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,6,3,2,20,100};
		arraysort as=new arraysort();
		int[] sortedarr=as.sortarr(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
