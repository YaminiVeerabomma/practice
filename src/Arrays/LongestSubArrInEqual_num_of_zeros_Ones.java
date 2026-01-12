package Arrays;

import java.util.*;

public class LongestSubArrInEqual_num_of_zeros_Ones {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 0};
        int maxLength = 0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            } else {
                arr[i] = 1;
            }
        }

       
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= n; j++) {

                int sum = 0;

                for (int k = i; k < j; k++) {
                    sum = sum + arr[k];
                }

                if (sum == 0) {
                    int length = j - i;  
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        System.out.println(maxLength);
    }
}
