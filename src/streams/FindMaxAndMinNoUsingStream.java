package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxAndMinNoUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(2,4,6,8,10);
		Optional<Integer> max_num=num.stream()
		   .max(Integer::compare);
		System.out.println( max_num);
		
		Optional<Integer> min_num=num.stream()
				   .min(Integer::compare);
				System.out.println( min_num);
	}

}
