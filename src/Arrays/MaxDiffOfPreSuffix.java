package Arrays;

public class MaxDiffOfPreSuffix {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 6, 2, 3};
        int n = arr.length;

        int[] prefixsum = new int[n];
        int[] suffixsum = new int[n];

        // Left sums (elements before index)
        prefixsum[0] = 0;
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i - 1];
        }

        // Right sums (elements after index)
        suffixsum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            suffixsum[i] = suffixsum[i + 1] + arr[i + 1];
        }

        int maxDiff = Integer.MIN_VALUE;

        // Exclude first and last index
        for (int i = 0; i < n ; i++) {
            int diff = Math.abs(prefixsum[i] - suffixsum[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        System.out.println(maxDiff);
    }
}
