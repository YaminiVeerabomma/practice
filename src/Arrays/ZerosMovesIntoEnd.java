package Arrays;
import java.util.*;

public class ZerosMovesIntoEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        List<Integer> result = new ArrayList<>();
        int zeroCount = 0;

      
        for (int num : arr) {
            if (num != 0) {
                result.add(num);
            } else {
                zeroCount++;
            }
        }

   
        for (int i = 0; i < zeroCount; i++) {
            result.add(0);
        }

        System.out.println(result);
    }
}
