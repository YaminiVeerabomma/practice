package streams;

import java.util.*;
import java.util.stream.*;

public class GroupByLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "cat", "dog", "bat", "mango");

        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
        // {3=[cat, dog, bat], 5=[apple, mango]}
    }
}
