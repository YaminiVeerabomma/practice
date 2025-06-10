package string;
import java.util.*;
public class StringBuffertest {

	public static void main(String[] args) {
		StringBuffer  sb=new StringBuffer ("hello");
		System.out.println(sb);
		int hashcode2=System.identityHashCode(sb);
		System.out.println("before opertion"+ " :"+hashcode2);
		sb.append("!hi");
		System.out.println(sb);
		int hashcode3=System.identityHashCode(sb);
		System.out.println("before opertion"+ " :"+hashcode3);
		/*
		 * sb.insert(2, "namaste"); System.out.println(sb); sb.replace(2,8,"!");
		 * System.out.println(sb); sb.delete(2, 5); System.out.println(sb);
		 * sb.reverse(); System.out.println(sb);
		 * 
		 * System.out.println(sb.capacity());
		 */
		


	}

}
