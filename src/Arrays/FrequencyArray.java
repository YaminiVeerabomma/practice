package Arrays;

import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {

    	int[] arr= {1,2,2,3,1,4,1};
        int[] count = new int[10]; 

        // count frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + " -> " + count[i]);
        }



        int maxFreq = 1;
        int result = -1;

        // find repeated element with highest frequency
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                if (count[i] > maxFreq || (count[i] == maxFreq && i > result)) {
                    maxFreq = count[i];
                    result = i;
                }
            }
        }

        System.out.println("Repeated element: " + result);
    }
}
