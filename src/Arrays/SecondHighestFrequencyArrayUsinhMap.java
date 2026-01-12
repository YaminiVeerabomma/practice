package Arrays;


import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestFrequencyArrayUsinhMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 1, 2, 2, 2, 3, 3};

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
        System.out.println(map);
        int maxFreq = -1;
        int secondMaxFreq = -1;
        List<Integer> freqList = new ArrayList<>(map.values());
        System.out.println(freqList);

        for (int i = 0; i < freqList.size(); i++) {
            int freq = freqList.get(i);

            if (freq > maxFreq) {
                secondMaxFreq = maxFreq;
                maxFreq = freq;
            } else if (freq < maxFreq && freq > secondMaxFreq) {
                secondMaxFreq = freq;
            }
        }
        if (secondMaxFreq == -1) {
            System.out.println("There is no second highest value");
            return;
        }

//        List<Integer> freqs = map.values().stream()
//        		.distinct()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(freqs);
        
//        if (freqs.size() < 2) {
//            System.out.println("There is no second highest value");
//            return;
//        }
        
      //  int secondHighestValue=freqs.get(1);
        
        System.out.println(secondMaxFreq);

        int result = Integer.MAX_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();
            
           
            	if (freq == secondMaxFreq) {
                    result = Math.min(result, num);
                }
            	
            

        }
        System.out.println(result);
        
	}

}
