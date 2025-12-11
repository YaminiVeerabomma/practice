package string;

public class Practice {
    public static void main(String[] args) {

        String str = "cheese";
        String add = "ay";
        StringBuilder newStr = new StringBuilder(str);
        StringBuilder newString = new StringBuilder();
        int pos = -1;
        int postion = 0;

        
        for (int i = 0; i < str.length(); i++) {   
            char ch = str.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                pos = 1;        
                postion = i;   
                break;
            }
        }


        if (pos == -1) {
            System.out.println(str);
            return;
        } else {

            int length = str.length();

            for (int i = postion; i < length; i++) {
                newString.append(str.charAt(i));
            }

            for (int i = 0; i < postion; i++) {
                newString.append(str.charAt(i));
            }

            newString.append(add);
        }

        System.out.println(newString);
    }
}
