package Arrays;
import java.util.*;

public class PrefixArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		int n=arr.length;
		List<Integer> PrefixSum=new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<n;i++) {
		sum=sum+arr[i];
		PrefixSum.add(sum);
			
		}
		System.out.println(PrefixSum);

	}

}
