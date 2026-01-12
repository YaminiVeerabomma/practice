package streams;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecond_highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 5, 20, 8, 25};

        int secondLargest = Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(arr.length - 2)
                .findFirst()
                .getAsInt();

        System.out.println("Second Largest: " + secondLargest);
    }
}
