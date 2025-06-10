package collection;
import java.util.*;
public class HashSetExample {
	public static void main(String[] args) 
	{
	 HashSet<Integer> hs = new HashSet<>();

     
   hs.add(1);
   hs.add(2);
   hs.add(6);
   hs.add(4);
   hs.add(3);
   System.out.println(hs);
  // System.out.println(hs.get(4));
  
	/*
	 * HashSet<Integer> hs1 = new HashSet<>();
	 * 
	 * 
	 * hs1.add(10); hs1.add(20); hs1.add(60); hs1.add(40); hs1.add(30);
	 * System.out.println(hs1); hs.addAll(hs1); System.out.println(hs);
	 */
   
	/*
	 * int target=4; boolean flag=false;
	 * 
	 * //for each loop for (Integer ele:hs) { if(ele.equals(target)) { flag=true;
	 * 
	 * 
	 * 
	 * // System.out.println(flag); } // System.out.print(ele + " ")
	 * 
	 * } //System.out.println(flag); if(flag==true) { hs.remove(target); hs.add(5);
	 * System.out.println(hs); }
	 */
	}
}
