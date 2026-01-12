package Arrays;

import java.util.*;



public class MissingFstPostive {

    public static void main(String[] args) {

        int[] arr = {2, -3, 4, 1, 1, 7};
        int n = arr.length;

        int result = 1;

        while (true) {
            boolean found = false;

           
            for (int i = 0; i < n; i++) {
                if (arr[i] == result) {
                    found = true;
                    break;
                }
            }

         
            if (!found) {
                System.out.println("Smallest Missing Positive = " + result);
                break;
            }

            result++;
        }
    }
}
