package Arrays;
import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
	LinkedList<String> al=new LinkedList<String>();
	al.add("one");
	al.add("two");
	al.add("1");
	al.add("2");
	System.out.println(al);
	al.addFirst("zero");
	al.addLast("infinty");
	System.out.println(al);
	al.remove(1);
	System.out.println(al);
	al.add( 1,"zeroo");
	System.out.println(al);
	//al.clear();
	System.out.println(al);
	System.out.println("normal list"+al);
	LinkedList al1=new LinkedList();
	al1 = (LinkedList)al.clone();
	System.out.println("after clone list" +al1);
	
	System.out.println(al1.get(0));
	System.out.println(al1.getFirst());
	System.out.println(al1.getLast());
	

	}

}
