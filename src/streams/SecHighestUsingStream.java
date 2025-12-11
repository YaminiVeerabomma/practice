package streams;

import java.util.*;

public class SecHighestUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(55,28,44,12,60);
		
		int SecHighest=num.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(-1);
		System.out.println("SecHighest num in list :"+SecHighest);

	}

}
