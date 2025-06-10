package Arrays;
import java.util.*;
public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Geek");
        lhs.add("For");
        lhs.add("Geeks");

        System.out.println("LinkedHashSet : " + lhs);	
        lhs.remove("For");
        System.out.println("After removing element " + lhs);
        System.out.println(lhs.remove("For"));
        for (String s : lhs)
            System.out.print(s + ", ");
        System.out.println();
        }

}
