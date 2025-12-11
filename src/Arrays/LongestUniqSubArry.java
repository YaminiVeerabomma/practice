package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestUniqSubArry {
    public static void main(String[] args) {
        int[] arr = {1,7,3,4,3};
        int n = arr.length;
        int maxLeng = 0;

        for(int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();

            for(int j = i; j < n; j++) {
                if(!l.contains(arr[j])) {
                    l.add(arr[j]);
                } else {
                    break;
                }
                maxLeng = Math.max(maxLeng, l.size());
            }
        }

        System.out.println(maxLeng);
    }
}
