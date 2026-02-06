package Arrays;

import java.util.*;

public class MaxLengthConsLengthUseHashSet {

    public static void main(String[] args) {

        int[] arr = {200, 1, 100, 3, 4, 2};

        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);   
        }

        int maxLen = 0;

        for (int num : s) {//for each loop

            
            if (!s.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (s.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        System.out.println(maxLen);
    }
}
