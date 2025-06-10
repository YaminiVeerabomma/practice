package string;

public class FrequanceOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdga";
		int n=s.length();
		int[] freq=new int[26];
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z') {
				freq[c -'a']= freq[c-'a']+1;
				for(int j=0;j<freq.length;j++) {
					System.out.print(freq[j]);
				}
				System.out.println("");
			}
		}
		for(int i=0;i<freq.length;i++) {
			System.out.print(freq[i]);
		}
	

	}

}





//Here's a Java solution to find the maximum difference between the frequency of characters with odd and even frequencies:
//
//```
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        String s = "aaaaabbc";
//        System.out.println(maxFrequencyDifference(s));
//    }
//
//    public static int maxFrequencyDifference(String s) {
//        Map<Character, Integer> freqMap = new HashMap<>();
//        int maxOdd = 0;
//        int minEven = Integer.MAX_VALUE;
//
//        // Calculate frequency of each character
//        for (char c : s.toCharArray()) {
//            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//        }
//
//        // Find max odd frequency and min even frequency
//        for (int freq : freqMap.values()) {
//            if (freq % 2 == 1 && freq > maxOdd) {
//                maxOdd = freq;
//            }
//            if (freq % 2 == 0 && freq < minEven) {
//                minEven = freq;
//            }
//        }
//
//        // Return max difference if both maxOdd and minEven are valid
//        return maxOdd > 0 && minEven != Integer.MAX_VALUE ? maxOdd - minEven : 0;
//    }
//
//
