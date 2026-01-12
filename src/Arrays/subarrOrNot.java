package Arrays;
import java.util.*;

public class subarrOrNot {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,3};

        boolean flag = false;
        int n = b.length;
        int start = 0;
        int end = n - 1;

        while (end < a.length) {
            int count = 0;

            // Check current window
            for (int i = start; i <= end; i++) {
                if (a[i] == b[i - start]) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == n) {
                flag = true;
                break;
            }

            start++;
            end++;
        }

        System.out.println(flag);
    }

}
