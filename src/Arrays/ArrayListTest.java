package Arrays;
import java.util.*;

public class ArrayListTest{
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
        list.add(2);
        list.add("one");
        list.add("two");
        list.remove(0);
        list.remove("one");
        list.set(0, 1);
        System.out.println(list.contains(3));
        System.out.println (list.contains("two"));
        System.out.println(list);
        System.out.println(list.isEmpty());
        int s=list.size();
        System.out.println(s);
        list.add("three");
        list.add(3);
        list.add("four");
        System.out.println("original list"+list);
        //list.removeRangeList(1,3);
        System.out.println("updated list "+list);
        }
}