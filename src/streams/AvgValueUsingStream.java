package streams;

import java.util.*;

public class AvgValueUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> num=Arrays.asList(2,4,6,8);
    double avg= num.stream()
                   .mapToInt(n->n)
                   .average() .orElse(0.0); 
    
    System.out.println(avg);
	}

}
