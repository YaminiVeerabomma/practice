package collection;
import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		List l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(34);
		l1.add(45);
		System.out.println(l1);
		System.out.println(l1.indexOf(34));
		/*
		 * List l2=new LinkedList(); l2.add(100); l2.add(200); l2.add(340); l2.add(450);
		 * System.out.println(l2); l1.addAll(l2); System.out.println(l1);
		 */


		
		/*
		 * //int targetElement=45; //boolean flag=false; //int index;
		 * 
		 * //for(int i=0;i<l1.size();i++) {
		 * 
		 * if(l1.get(i).equals(targetElement)) { flag=true; //System.out.println(flag);
		 * System.out.println(l1.get(i)); index=l1.indexOf(l1.get(i));
		 * System.out.println(index); l1.set(index, 55); //l1.remove(i);
		 * //System.out.println(l1); } } //System.out.println(flag);
		 * System.out.println(l1);
		 */
	}

}
