package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestStringUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList("java","hello","however");
		
		// 1. Convert the list to a stream.
        Optional<String> longestString = words.stream()
            // 2. Use max() to find the longest string based on length.
            .max(Comparator.comparingInt(String::length));

        // 3. Safely handle the Optional result and print it.
        //    orElse("N/A") provides a default value if the list is empty.
        String result = longestString.orElse("The list is empty.");
        
        System.out.println("The list of words: " + words);
        System.out.println("The longest string is: " + result); 
        // Expected Output: Elephant
    }

}
