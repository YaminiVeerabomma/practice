package Arrays;

import java.util.*;

public class MaxCount {

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {1, 1, 2, 2, 3};

        Map<Integer, Integer> m = new HashMap<>();

        // count frequency
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }

        // find max frequency
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxCount) {
                maxCount = freq;
            }
        }
        System.out.println(maxCount); // prints maximum frequency

        // count how many singers have max frequency
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int freq = entry.getValue();
            if (freq == maxCount) {
                count++;
            }
        }
        System.out.println(count); // prints number of favourite singers
    }
}
