package Arrays;

import java.util.*;

public class CountDistinctWdK_SldWd {

    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 9, 3};
        int k = 3;
        int n = arr.length;

        int minLen = Integer.MAX_VALUE;

        int windowLength = k;

        while (windowLength <= n) {

            for (int start = 0; start + windowLength - 1 < n; start++) {

                int end = start + windowLength - 1;

                // Copy window
                List<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(arr[i]);
                }

              
                Collections.sort(list);

                
                int count = 1;
                int maxCount = 1;

                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i) - list.get(i - 1) == 1) {
                        count++;
                        maxCount = Math.max(maxCount, count);
                    } else {
                        count = 1;
                    }
                }

             
                if (maxCount >= k) {
                    minLen = Math.min(minLen, windowLength);
                }
            }

            windowLength++;
        }

        System.out.println(minLen);
    }
}
