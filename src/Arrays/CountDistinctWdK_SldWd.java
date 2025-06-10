package Arrays;
import java.util.*;
public class CountDistinctWdK_SldWd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 1, 3, 4, 2, 3};
		int k=4;
		int n=arr.length;
		int start =0;
		int end=k-1;
		while(end<n) {
			int count=0;
			Set result=new HashSet<> ();
		for(int i=start;i<=end;i++) {
			if(!result.contains(arr[i])) {
				count++;
				result.add(arr[i]);
				
			}
		}
			System.out.println(count);
			start++;
			end++;
			
		
		}
		

	}

}
