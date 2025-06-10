package Arrays;

public class SingleNonDuplicateOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,3,3,4,4,8,8};
		//int[] arr= {3,3,7,7,10,11,11};
		int n=arr.length;//length of output array 
		int ans=0;// assume ans is 0 and update store the output 
		for(int i=0;i<n-1;i=i+2) {
			if(arr[i]!=arr[i+1]) {//compair the teo elements seq
				ans=arr[i];//incase not equal update the ans
				System.out.println(ans);
				break;//once ans is update break the loop
			}
		}
		
	}

}
//Pointer     TimeComplexity      SpaceComplexity
//    1         O(log n)				O(1)