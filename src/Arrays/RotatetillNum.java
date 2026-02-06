package Arrays;

class RotatetillNum {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i <= 20; i++) {

            String s = String.valueOf(i);
            String rotated = "";

            boolean valid = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c == '0') rotated = '0' + rotated;
                else if (c == '1') rotated = '1' + rotated;
                else if (c == '6') rotated = '9' + rotated;
                else if (c == '8') rotated = '8' + rotated;
                else if (c == '9') rotated = '6' + rotated;
                else {
                    valid = false;   // invalid digit
                    break;
                }
            }

            if (valid && s.equals(rotated)) {
            	System.out.println(rotated);
                count++;
            }
        }

        System.out.println(count); 
    }
}
