package Arrays;

public class PrefixSumArr {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        int sum = 0;
        int[] sumOfArr = new int[n];

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sumOfArr[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sumOfArr[i] + " ");
        }

        System.out.println();

        int start = 1;
        int end = 3;
        int result;

        if (start == 0) {
            result = sumOfArr[end];
        } else {
            result = sumOfArr[end] - sumOfArr[start - 1];
        }


        System.out.println(result);
    }
}
