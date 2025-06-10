package string;

import java.util.HashMap;
import java.util.*;

public class RomanToInt {
	public int romanToInt(String s) {
        Map<Character,Integer> m=new HashMap<>();
        
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);   
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int total=0;
        int prevValue = 0;

       
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = m.get(s.charAt(i));

         
            if (currentValue < prevValue) {
                total =total- currentValue;
            } else {
                total =total+ currentValue;
            }

         
            prevValue = currentValue;
        }

        return total;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="III";
		RomanToInt  ri=new RomanToInt ();
		 int result =ri.romanToInt(s);
		 System.out.println(result);

	}

}
