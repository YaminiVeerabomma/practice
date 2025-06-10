package Arrays;

public class MinSizeSubArraySumOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,2,4,3};
		int target=7;
//		int[] arr= {1,4,4};
//		int target=4;
//		int[] arr= {1,1,1,1,1,1,1,1};
//		int target=11;
		int n=arr.length;//length of array
		int minLength=Integer.MAX_VALUE;//assume minlength
		//ittarate the start to end of array
		for(int i=0;i<n;i++) {
			int sum=0;//assume sum value
			for(int j=i;j<n;j++) {
			//find sum
				sum=sum+arr[j];
				if(sum>=target) {//if sume if equal or sim is greater then target
					minLength = Math.min(minLength, j - i + 1);//comapare old minlen and current min length
					break;//once min length is find break the loop
				}
				
				
			}
		}
		if(minLength==Integer.MAX_VALUE) {//in case sume is not equal to target at thet posion minvale is not upadte 
			System.out.println("0");//print 0 
			return;
		}
		System.out.println(minLength);

	}

}
//Pointers      TimeComplexity      SpaceComplexity
//2					O(n)			O(n)