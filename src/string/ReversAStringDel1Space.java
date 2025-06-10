package string;
import java.util.*;

public class ReversAStringDel1Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "  the   sky is   blue  ";
		//String s="  hello world  ";
		String s="a good   example";
        //div string element in word array
		//trim means delete the spacess
		//split method is div  the string 
        String[] words = s.trim().split("\\s+");
        //creat stringbuilder for storing the output 
        StringBuilder reversed = new StringBuilder();
        //ittarate the word length
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

       //print reversed sb
        System.out.println(reversed.toString());
    }
}
//pointers  	timeComplexity		SpaceComplexity
//  1				O(n)					O(n)