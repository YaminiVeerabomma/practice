package streams;

import java.util.Arrays;

public class ReverseStringUsingStream {
    public static void main(String[] args) {
        String str = "Yamini";

        String reversed = Arrays.stream(str.split(""))
                                .reduce("", (a,b) -> b + a); 

        System.out.println("Reversed: " + reversed);
    }
}
