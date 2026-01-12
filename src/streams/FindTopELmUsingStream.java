package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTopELmUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> num=Arrays.asList(2,4,6,8,10);
 List<Integer> Top=num.stream()
		 .sorted(Comparator.reverseOrder())
		 .limit(3)
		 .collect(Collectors.toList());
 	System.out.println("Top 3 elem in list:" +Top);
	}

}
