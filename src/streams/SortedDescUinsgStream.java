package streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortedDescUinsgStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(2,4,1,9,3,5,0,10);
		
		List<Integer> descOrd=num.stream()
				//.sorted()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("desending order :" +descOrd );
		
		

	}

}
