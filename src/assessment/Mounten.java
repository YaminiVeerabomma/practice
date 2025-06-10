package assessment;

public class Mounten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,1,4,5,6,7,8,9,8,7,6,5};
		int n=arr.length;
		if(n<=3) {
			System.out.println("0");
			
		}
		int result=0;
		for(int i=1;i<n-1;i++) {
			if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]) {
				int left=i-1;
				int right=i+1;
				while(left>0&&arr[left-1]<arr[left]) {
					left--;
				}
				while(right<n-1&&arr[right]>arr[right+1]) {
					right++;
				}
				int length=right-left+1;
				result=Math.max(result, length);
				
			}
		}
System.out.println(result);
	}

}
