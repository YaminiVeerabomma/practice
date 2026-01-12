package Arrays;

public class PairDifferenceEqlToCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 4, 5, 7};
        int k = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] - arr[i] == k) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
//import java.util.*;
//
//public class PairDifferenceEqlToCond {
//
//    public static void main(String[] args) {
//
//        int[] arr = {1, 1, 3, 3, 5};
//        int k = 2;
//
//        // Remove duplicates
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int i=0;i<arr.length;i++) {
//            set.add(arr[i]);
//        }
//
//        
//
//       
//        for (int i = 0; i < set.size(); i++) {
//            for (int j = i + 1; j < set.size(); j++) {
//
//                if (set.get[j] - set.get[i] == k) {
//                    System.out.println("(" + set.get[i] + "," + set.get[j] + ")");
//                }
//            }
//        }
//    }
//}
//--------------------------------------------------------------------------


//public static void main(String[] args) {
//
//    int[] arr = {1, 3, 4, 5, 7};
//    int k = 2;
//
//    findPairs(arr, k);
//}
//
//public static void findPairs(int[] arr, int k) {
//
//    int left = 0;
//    int right = 1;
//
//    while (right < arr.length) {
//
//        int diff = arr[right] - arr[left];
//
//        if (diff == k) {
//            System.out.println("(" + arr[left] + ", " + arr[right] + ")");
//
//            // move both to avoid duplicates
//            left++;
//            right++;
//        }
//        else if (diff < k) {
//            right++;
//        }
//        else { // diff > k
//            left++;
//
//            // keep right always ahead of left
//            if (left == right) {
//                right++;
//            }
//        }
//    }
//}