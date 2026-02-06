package Arrays;

import java.util.*;

public class RotateKTime {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);
        }

        int count = 0;

        while (count < k) {
            int last = l.get(l.size() - 1); 
            l.remove(l.size() - 1);         
            l.add(0, last);                 
            count++;
        }

        System.out.println(l);
    }
}
