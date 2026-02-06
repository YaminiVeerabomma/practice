package Arrays;

public class RangeSumQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,6,2,8,9,2};
		 int[][] queries = {
		            {1, 3},
		            {0, 4},
		            {2, 5}
		        };

		        int n = arr.length;
		        int[] prefixSum=new int[n];
		        int sum=0;
		        for(int i=0;i<n;i++) {
		        	sum=sum+arr[i];
		        	prefixSum[i]=sum;
		        //	System.out.println(sum);
		        	
		        }
		        for (int i = 0; i < queries.length; i++) {

		            int L = queries[i][0];
		            int R = queries[i][1];

		            int total=0;
		            if (L == 0) {
		                total = prefixSum[R];
		            } else {
		                total = prefixSum[R] - prefixSum[L - 1];
		            }

		            System.out.println(total);
		        }
		        

	}

}
