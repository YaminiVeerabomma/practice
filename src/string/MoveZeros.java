package string; 
import java.util.*;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,0,3,12};
		int n=nums.length;
		System.out.println(n);
		int index=0;
	
		for(int i=0;i<n;i++) {
			if(nums[i]!=0) {
				nums[index]=nums[i];
				index++;
			}
		}
		for(int j=index;j<n;j++) {
			nums[j]=0;
		}
				
			System.out.println(Arrays.toString(nums));
	}

}
