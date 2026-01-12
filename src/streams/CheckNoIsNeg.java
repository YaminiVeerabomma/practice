package streams;

import java.util.*;

public class CheckNoIsNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> num1=Arrays.asList(1,2,3,-1);
	List<Integer> num2=Arrays.asList(1,2,3,1);
	
	boolean neg=num1.stream()
	.anyMatch(n->n<0);
	System.out.println("num1 contain negitive:"+neg);
	
	boolean pos=num2.stream()
			.allMatch(n->n>0);
	
	System.out.println("num2 contain positive:"+pos);	

	}

}
