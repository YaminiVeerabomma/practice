package Most_Asked_DSA;

public class Find_Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,4,2,5,3,6};
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		
		}
		
		System.out.println(max);
		System.out.println(min);


	}

}
