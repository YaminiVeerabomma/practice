package Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class PostFixArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5 };
		int n=arr.length;
		List<Integer> PostfixSum=new ArrayList<Integer>();
		int sum=0;
		for(int i=n-1;i>=0;i--) {
		sum=sum+arr[i];
		PostfixSum.add(sum);
		}
		System.out.println(PostfixSum);
		Collections.reverse(PostfixSum);
		System.out.println(PostfixSum);
		
	}

}
