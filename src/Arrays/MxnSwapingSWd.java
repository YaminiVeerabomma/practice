package Arrays;
import java.util.*;
public class MxnSwapingSWd {
	public int MinSwap(int[] arr, int b) {
		int n=arr.length;
		int fevcount=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<b) {
			fevcount++;
				
			}
		}
		System.out.println("fevcount :"+fevcount);
		
		int start=0;
		int end=fevcount-1;
		int maxcount=0;
	
		while (end < n) {
			//System.out.println(end);
		    int count = 0;
		    for (int i = start; i <= end; i++) {                
		        if (arr[i] > b) {
		            count++;
		           //System.out.println(count);
		        }
		    }
		        maxcount = Math.max(maxcount, count);
		        //System.out.println(maxcount);
		        start++;
		        end++;
		}
		    
		return maxcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,17,100,11};
		int b=20;
		MxnSwapingSWd ms=new MxnSwapingSWd();
		int result=ms.MinSwap(arr,b);
		System.out.println("maxcount swapping :"+result);

	}

}
