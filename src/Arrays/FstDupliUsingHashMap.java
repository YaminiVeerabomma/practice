package Arrays;

import java.util.*;

public class FstDupliUsingHashMap {

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 3}; 
        Map<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println("First Duplicate Element: " + arr[i]);
                found = true;
                break;
            } else {
                map.put(arr[i], 1);
            }
        }

        if (!found) {
            System.out.println("No duplicate element found");
        }
    }
}
