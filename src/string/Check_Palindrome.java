package string;

public class Check_Palindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {

        // If already palindrome
        if (isPalindrome(s)) {
            return true;
        }

        // Try removing one character at each position
        for (int i = 0; i < s.length(); i++) {
            String newString = s.substring(0, i) + s.substring(i + 1);
            if (isPalindrome(newString)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String input = "abca";
        System.out.println(validPalindrome(input));
    }
}
