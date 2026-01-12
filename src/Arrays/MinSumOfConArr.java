package Arrays;

public class MinSumOfConArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1};
		int	k = 3;
		int windowSum = 0;

		for(int i=0;i<k;i++)
		windowSum += arr[i];

		int minSum = windowSum;

		for(int i=k;i<arr.length;i++){
		windowSum += arr[i];
		windowSum -= arr[i-k];
		minSum = Math.min(minSum, windowSum);
		}
		System.out.println(minSum);

	}

}
