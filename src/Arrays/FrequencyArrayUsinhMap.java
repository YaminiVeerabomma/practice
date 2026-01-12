package Arrays;

import java.util.*;

public class FrequencyArrayUsinhMap {
    public static void main(String[] args) {

        int[] arr = {2,2,3,3};

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int maxFreq = 0;
        int result = Integer.MIN_VALUE;

        // Step 2: Find element with highest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            
                if (freq > maxFreq || (freq == maxFreq && num > result)) {
                    maxFreq = freq;
                    result = num;
           
            }
        }

        System.out.println("Repeated element: " + result);
    }
}
