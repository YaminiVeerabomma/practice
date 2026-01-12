package string;

import java.util.ArrayList;
import java.util.List;

public class CountWordsInString {

    public static void main(String[] args) {

        String str = "Java Is Fun";

        List<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                words.add(word);
                word = "";
            }
        }

        words.add(word);

        System.out.println(words.size());
    }
}
//"The first words.add(word) stores words when a space is encountered,
//and the second one ensures the last word is added because it doesn’t end with a space.”
