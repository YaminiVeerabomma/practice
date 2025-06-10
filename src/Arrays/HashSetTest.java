package Arrays;
import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet  hs=new HashSet();
		hs.add("one");
		
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

        hs.remove("one");
        //System.out.println(hs);
        System.out.println(  hs.remove("two"));
        System.out.println(  hs.size());
        HashSet<String> hs1=new HashSet<String>();
        hs1.add("two");
		hs1.add("1");
		hs1.remove("1");

        System.out.print("Using enhanced for loop : ");
        for (String element : hs1)
            System.out.print(element + " , ");

	}

}
