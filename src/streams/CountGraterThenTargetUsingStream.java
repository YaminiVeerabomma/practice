package streams;

import java.util.Arrays;
import java.util.List;

public class CountGraterThenTargetUsingStream {

	public static void main(String[] args) {
	List<Integer> num=Arrays.asList(2,14,16,8,20);
	
	long greaterThenTen=num.stream()
		.filter(n->n>10)
		.count();
	System.out.println("num >10 elements count is " +greaterThenTen);
	
		
	

	}

}
