package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Find_Sum_Of_Query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		int n=arr.length;
		List<Integer> PrefixSum=new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<n;i++) {
		sum=sum+arr[i];
		PrefixSum.add(sum);
			
		}
		System.out.println(PrefixSum);
		int left=1;
		int right=3;
		int rangeSum;
        if (left == 0) {
            rangeSum = PrefixSum.get(right);
        } else {
            rangeSum = PrefixSum.get(right) - PrefixSum.get(left - 1);
        }

        System.out.println("Range Sum: " + rangeSum);
    }
	
}
