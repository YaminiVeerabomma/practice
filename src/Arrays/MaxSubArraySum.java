package Arrays;

public class MaxSubArraySum {

	public int arraysum(int[] arr)
	{
	int n=arr.length;
	// Initialize maxsubsum with the smallest possible integer value
    int maxsubsum = Integer.MIN_VALUE;

    // Outer loop picks the starting point of subarray
    for (int i = 0; i < n; i++) {
        int currentsum = 0; // Initialize current sum for this subarray

        // Inner loop picks the ending point of subarray
        for (int j = i; j < n; j++) {
            // Add current element to the subarray sum
            currentsum = currentsum + arr[j];

            // Update maxsubsum if current subarray sum is greater
            if (currentsum > maxsubsum) {
                maxsubsum = currentsum;
            }
        }
    }

    // Return the maximum subarray sum found
    return maxsubsum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		 MaxSubArraySum  ms=new  MaxSubArraySum();
       int sum=ms.arraysum(arr);
       System.out.println(sum);
	}

}
