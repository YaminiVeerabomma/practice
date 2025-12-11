package streams;

import java.util.Arrays;
import java.util.List;

public class SquerUsingStream {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(2,4,6,8,10);
		
		num.stream()
		   .map(n->n*2)
		   .forEach(System.out::println);

	}

}
