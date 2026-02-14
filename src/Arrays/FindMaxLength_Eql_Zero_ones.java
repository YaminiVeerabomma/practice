package Arrays;

public class FindMaxLength_Eql_Zero_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0, 1, 0, 1, 1, 0, 0};
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int  OnesCount=0;
			int ZerosCount=0;
			for(int j=i;j<n;j++) {
				if(arr[j]==1) {
					OnesCount++;
				}else {
					ZerosCount++;
				}
				if(OnesCount==	ZerosCount) {
					max=Math.max(max, j-i+1);
				}
				
			}
		}
		System.out.println(max);

	}

}
