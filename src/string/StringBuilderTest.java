package string;

public class StringBuilderTest {
	public static void main(String[] args) {
	StringBuilder  sb=new StringBuilder("how");
	System.out.println(sb);
	int hashcode4=System.identityHashCode(sb);
	System.out.println("before opertion"+ " :"+hashcode4);
	sb.append("!hi");
	System.out.println(sb);
	int hashcode5=System.identityHashCode(sb);
	System.out.println("before opertion"+ " :"+hashcode5);
	/*
	 * sb.insert(2, "hello"); System.out.println(sb); sb.replace(2,4,"!");
	 * System.out.println(sb); sb.delete(2,3); System.out.println(sb); sb.reverse();
	 * System.out.println(sb);
	 * 
	 * System.out.println(sb.capacity());
	 */
	}

}
