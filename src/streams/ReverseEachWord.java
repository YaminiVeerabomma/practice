package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Java Streams are powerful";

        String result = Arrays.stream(str.split(" "))  // split into words
                .map(word -> new StringBuilder(word).reverse().toString()) // reverse each word
                .collect(Collectors.joining(" "));  // join back into a sentence

        System.out.println(result);
    }
}
