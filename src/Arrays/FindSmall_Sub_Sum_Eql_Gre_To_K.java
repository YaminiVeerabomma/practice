package Arrays;

public class FindSmall_Sub_Sum_Eql_Gre_To_K {

    public static void main(String[] args) {
    	//int[] arr= {1,1,1};
        int[] arr = {2, 3, 1, 2, 4, 3};
        int n = arr.length;
       // int k=4;
        int k = 7;

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum =sum+ arr[right];

            while (sum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                sum=sum- arr[left];   
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLen);
        }
    }
}