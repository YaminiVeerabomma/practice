package Arrays;

public class equilibriumIndex_prefix_Suffix_apprch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,2,2};
		int n=arr.length;
		int[] prefixsum=new int[n];
		int[] suffixsum=new int[n];
		
		prefixsum[0]=arr[0];
		for(int i=1;i<n;i++) {
			prefixsum[i]=prefixsum[i-1]+arr[i];
		}
		
		suffixsum[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			suffixsum[i]=suffixsum[i+1]+arr[i];
		}
		
		for (int i = 0; i < n; i++) {
			//edge cases
			int leftsum=0;
			int rightsum=0;
			if(i==0) {
				if(leftsum==suffixsum[i+1]) {
					System.out.println(i);
					return;
				}
			}
			if(i==n-1) {
				if(rightsum==prefixsum[i-2]) {
					System.out.println(i);
					return;
				}
			}
			
            if (prefixsum[i - 1] == suffixsum[i + 1]) {
                System.out.println(i);
                return;
            }
        }
		System.out.println(-1);
		

	}

}
