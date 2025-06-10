package Arrays;
import java.util.*;

public class FindFirstLastPositionOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = {-1, -1};

        // Find first  position
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1; // continue search on the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Find last position
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1; // continue search on the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
//Pointers 	TimeComplexity			SpaceComplexity
//     5		O(log n)              O(log n)

