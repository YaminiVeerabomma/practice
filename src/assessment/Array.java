package assessment;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,3,7,1};
        int n=arr.length;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]>arr[j]) {
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        for(int i=0;i<n;i++) {
	System.out.print(arr[i]);
        }
	}

}
