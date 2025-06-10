package Arrays;
import java.lang.reflect.Array;
import java.util.*;
public class PrintIndexSumIsEqualToArrayEl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 4, 20, 3, 10, 5};
		int sum=33;
		int n=arr.length;
		int start =0;
		int end=n-1;
		while(start<n){
			int add=0;
			for(int i=start;i<=end;i++) {
				add=add+arr[i];
				if(add==sum) {
					System.out.print(start+" ");
					System.out.println(i);
					break;
				}
			}
			start++;
			
		}

	}

}
