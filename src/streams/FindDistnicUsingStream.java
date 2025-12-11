package streams;

import java.util.*;

public class FindDistnicUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(2,4,2,6,8,10,6);
		num.stream()
			.distinct()
			.forEach(System.out::println);

	}

}
