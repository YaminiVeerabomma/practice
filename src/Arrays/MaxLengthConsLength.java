package Arrays;

import java.util.Arrays;

public class MaxLengthConsLength {

    public static void main(String[] args) {

        int[] arr = {200, 1, 100, 3, 4, 2};
        Arrays.sort(arr);

        int n = arr.length;
        int count = 1;
        int max = 1;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else if (arr[i] != arr[i + 1]) {
                count = 1;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
