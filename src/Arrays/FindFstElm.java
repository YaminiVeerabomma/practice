package Arrays;

import java.util.*;


public class FindFstElm {

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 4, 5, 6, 3};
        int n = arr.length;

      
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);

      
        int maxFreq = 0;
        List<Integer> freqList = new ArrayList<>(map.values());
        System.out.println(freqList);
        for (int i = 0; i < freqList.size(); i++) 
        { 
        	int freq = freqList.get(i);
        	if(freq >maxFreq)
        	{ 
        		maxFreq=freq;
        	}
        	}
        System.out.println("Max Frequency = " + maxFreq);
        //we can achive max freq using entry set Method in Map
        //for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//        int freq = entry.getValue();
//
//        if (freq > maxFreq) {
//            maxFreq = freq;
//        }
//    }

        
        int result = -1;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == maxFreq) {
                result = arr[i];
                break; 
            }
        }

        System.out.println("Result = " + result);
    }
}

//“Find the element with the highest frequency.
//If frequency ties, return the element that appears first in the array.”
//
//This means two rules:
//
//Primary rule → choose the element that appears maximum number of times
//
//Tie-breaker rule → if two or more elements have the same highest frequency, choose the one that appears earlier in the array
