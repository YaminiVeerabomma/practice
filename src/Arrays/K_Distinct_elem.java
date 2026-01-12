package Arrays;

import java.util.*;

public class K_Distinct_elem {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5};
        int k = 3;

        // store minimum range length
        int minLen = Integer.MAX_VALUE;

        for (int start = 0; start < arr.length; start++) {
            HashSet<Integer> set = new HashSet<>();
            for (int end = start; end < arr.length; end++) {
                set.add(arr[end]);

                // once the set reaches k distinct elements
                if (set.size() == k) {
                    int windowLen = end - start + 1;
                    minLen = Math.min(minLen, windowLen);
                    break; // stop expanding this window
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println(-1); // no such subarray
        } else {
            System.out.println(minLen);
        }
    }
}
