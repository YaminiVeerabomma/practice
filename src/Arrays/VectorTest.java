package Arrays;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector v=new Vector();
		Vector<String> v1=new Vector<String>();
		v.add("1");
		System.out.println(v);
		v1.addElement(null);
		System.out.println(v);
		v1.addElement(null);
		System.out.println(v);
		System.out.println("vector size "+ v.size());
		System.out.println("vector capacity"+v.capacity());
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add("0");
		v.add("five");
		v1.add("hundread");
		v1.add(null);
		//System.out.println(v1);
		//System.out.println("vector size "+ v1.size());
		//System.out.println("vector capacity"+v1.capacity());
		System.out.println(v);
		

		

	}

}
