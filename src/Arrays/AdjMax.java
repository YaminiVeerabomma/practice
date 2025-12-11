package Arrays;

public class AdjMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-2,-5};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				 int sul=nums[j]-nums[i];
				 System.out.println(sul);
				 max=Math.max(max, sul);
				 
				 
			}
		}
		System.out.println(max);
	}

}
