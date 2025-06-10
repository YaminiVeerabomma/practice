package Arrays;
import java.util.*;
public class SearchInsertPostionOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7};
		int target=8;
		int n=arr.length;// length of array
		int result=0;//asume reult is zer0
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {//array elemet is equal to target that is potion of target
				result=i;
				break;
				
			}
		  	else  if(arr[i]>target) {//when array elemnt is greater the target that is the potion of target
		  		
		  		result=i;
		  		break;
		  		
			}
		  	else {//element is less the ans is i+1
		  		result=i+1;
		  	}
		}//print the result
		System.out.println(result);

	}

}
//Pointer     TimeComplexity	SpaceComplexity
//1					O(n)			O(1)
