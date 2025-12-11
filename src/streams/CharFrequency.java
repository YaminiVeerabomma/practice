package streams;

import java.util.*;
import java.util.stream.*;

public class CharFrequency {
    public static void main(String[] args) {

        String s = "banana";

        Map<Character, Long> freq = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(freq); 
    }
}
