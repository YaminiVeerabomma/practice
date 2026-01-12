package string;

import java.util.ArrayList;
import java.util.List;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is fun";
//		-----------------------------
//		str=str.replace(" ", "");
//		System.out.println(str);
//      -----------------------------
//		str = str.replaceAll("\\s+", "");
//		System.out.println(str);
//  	------------------------------
		
		String result = "";

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (ch != ' ') {
		        result = result + ch;
		    }
		}

		System.out.println(result);

	}

}
