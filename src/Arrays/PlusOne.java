package Arrays;
import java.util.*;
public class PlusOne {
	public static int[] plusOneArr(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {//ittarate the arr end to start
            if (digits[i] ==9) {//if ekement is equal to 9 we update the 0
                digits[i]=0;
             }
            else {//else +1
            digits[i] =digits[i]+1;
            return digits;
            }
        }
        int[] newNumber = new int[n + 1];//we create new array for all the elemnts are 9's so we create new arr +extra space
        newNumber[0] = 1;//we put 0 postion is 1
        return newNumber;//return new arr
    }

    public static void main(String[] args) {
//        int[] digits = {1, 2, 3};
    	//int[] digits = {9};
    	//int[] digits= {3,9};
    	int[] digits= {9,9,9,9,9};
    	int[] result = plusOneArr(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
    
}

	