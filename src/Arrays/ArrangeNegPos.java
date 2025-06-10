package Arrays;
import java.util.*;
import java.util.List;

public class ArrangeNegPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,-6,3,-5,8,9};
		List l1=new ArrayList();
		List l2=new ArrayList();
		List<Integer> combinedList = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
				if(arr[i]<0)
				{
				l1.add(arr[i]);}
				else 
				{
				l2.add(arr[i]);
				}
			
				
		}
//		combinedList.addAll(l1);
//		combinedList.addAll(l2);
//		System.out.print(combinedList);
		l1.addAll(l2);
		System.out.println(l1);
		

	}

}
