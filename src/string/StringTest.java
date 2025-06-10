package string;

public class StringTest {

	public static void main(String[] args) {
	String s="hello!";
	System.out.println(s);
	int hashcode=System.identityHashCode(s);
	System.out.println("before opertion"+ " :"+hashcode);
	/*
	 * System.out.println(s.toUpperCase()); System.out.println(s.toLowerCase());
	 * System.out.println(s.length()); String s1="how are you";
	 * System.out.println(s1.indexOf("are")); System.out.println(s.concat(s1));
	 * String a="10"; String b="20"; String c=a+b; System.out.println(c); String
	 * d="10"; int e=20; String f=d+e; System.out.println(f); String
	 * s2="hello!\n hi"; System.out.println(s2); String s3="hello!\t hi";
	 * System.out.println(s3); String s4="ho\bw!are you"; System.out.println(s4);
	 * 
	 * 
	 */
	
     //String s1="hi";
     s=s+"hello";
     System.out.println(s);
     int hashcode1=System.identityHashCode(s);
     System.out.println("after opertion"+":"+hashcode1);
	

	}

}
