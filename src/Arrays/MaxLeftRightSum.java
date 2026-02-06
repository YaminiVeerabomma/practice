package Arrays;

public class MaxLeftRightSum {

    public static void main(String[] args) {

        int[] arr = {5, -2, 3, 1, 2};
        int n = arr.length;

        int[] prefixsum = new int[n];
        int[] suffixsum = new int[n];

      
        prefixsum[0] = 0;
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i - 1];
            System.out.print(prefixsum[i] + ",");
        }
        System.out.println();

      
        suffixsum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            suffixsum[i] = suffixsum[i + 1] + arr[i + 1];
            System.out.print(suffixsum[i] + ",");
        }
        System.out.println();

        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxLeft = Math.max(maxLeft, prefixsum[i]);
            maxRight = Math.max(maxRight, suffixsum[i]);
        }

        System.out.println("Max Left Sum = " + maxLeft);
        System.out.println("Max Right Sum = " + maxRight);
    }
}
