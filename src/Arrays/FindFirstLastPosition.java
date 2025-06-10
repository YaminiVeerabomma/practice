package Arrays;

public class FindFirstLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,7,7,8,8,8,10};
		int target=8;
		int n=nums.length;
		int start=-1;
		int end=-1;
		//to find the start postion
		for(int i=0;i<n;i++) {
			if(nums[i]==target) {
				start=i;
				break;
			}
		}
		
		//to find the end position 
		//start to n
		for(int i=start;i<n;i++) {
			if(nums[i]==target) {
				end=i;
				
			}
		}
		// print start and end postion
		System.out.println(start+" ,"+end);

	}

}
//Pointers 	TimeComplexity			SpaceComplexity
//4	         	O(n)                     O( 1)
