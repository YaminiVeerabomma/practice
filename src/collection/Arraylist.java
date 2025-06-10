package collection;

import java.util.*;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		List a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		System.out.println(a.indexOf(30));
		/*
		 * List b=new ArrayList(); b.add(100); b.add(200); b.add(300); b.add(400);
		 * System.out.println(b); a.addAll(b); System.out.println(a);
		 */
		/*
		 * int targetElement=20; int index; boolean flag=false;
		 * 
		 * for(int i=0;i<a.size();i++) {
		 * 
		 * if(a.get(i).equals(targetElement)) { flag=true;
		 * 
		 * System.out.println(a.get(i)); System.out.println(a.get(i));
		 * index=a.indexOf(a.get(i)); System.out.println(index); a.set(index, 55);
		 * 
		 * //a.remove(i); //System.out.println(a);
		 * 
		 * 
		 * 
		 * } } //System.out.println(flag); System.out.println(a);
		 */
	}

}
