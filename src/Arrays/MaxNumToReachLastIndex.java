package Arrays;

public class MaxNumToReachLastIndex {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

   
        for (int start = 0; start < n; start++) {
            int sum = 0;
            int idx = start;

            while (idx < n) {
                sum =sum+ arr[idx];
                idx = idx + arr[idx];
            }

        
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum); 
    }
}
