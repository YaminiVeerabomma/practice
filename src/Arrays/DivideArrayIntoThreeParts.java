package Arrays;

public class DivideArrayIntoThreeParts {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 0, 3};
        int n = arr.length;

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

       
        if (totalSum % 3 != 0) {
            System.out.println("[-1, -1]");
            return;
        }

        int target = totalSum / 3;

        for (int i = 0; i < n - 2; i++) {

            int sum1 = 0;
            for (int a = 0; a <= i; a++) {
                sum1 += arr[a];
            }

            if (sum1 != target) continue;

            for (int j = i + 1; j < n - 1; j++) {

                int sum2 = 0;
                for (int b = i + 1; b <= j; b++) {
                    sum2 += arr[b];
                }

                if (sum2 != target) continue;

                int sum3 = 0;
                for (int c = j + 1; c < n; c++) {
                    sum3 += arr[c];
                }

                if (sum3 == target) {
                    System.out.println("Result: [" + i + ", " + j + "]");
                    return;
                }
            }
        }

        System.out.println("Result: [-1, -1]");
    }
}
