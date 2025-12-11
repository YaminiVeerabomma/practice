package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfListUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(2,4,6,8,10);
		
		int sum=num.stream()
		 .reduce(0,(total,n)->total+n);
		System.out.println(sum);
					

	}

}
