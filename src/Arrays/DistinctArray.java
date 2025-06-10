package Arrays;
import java.util.ArrayList;
import java.util.*;

public class DistinctArray {
	
	public  ArrayList<Integer> PrintDistnctArray(int[] arr)
	{

        ArrayList<Integer> arrayList = new ArrayList<>();  
        arrayList.add(arr[0]);
        for (int i=1;i<arr.length;i++){
            //if(!unique.contains(arr[i])){
                //unique.add(arr[i]);
        	if(arr[i]!=arr[i-1])
        	{
             arrayList.add(arr[i]);
            }
		}
        return arrayList;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,4,4,5,5};
		DistinctArray da=new DistinctArray();
		 ArrayList<Integer> unique=da.PrintDistnctArray(arr);
		 System.out.print(unique);
	 
	}

}
