package Arrays;

public class FindPaitClosestToZero {

    public static void main(String[] args) {

        int[] arr = {-10, -3, 1, 4, 8, 12};
        int n = arr.length;

        int minSum = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int sum = arr[i] + arr[j];
                
           
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }

        System.out.println("Pair = (" + first + ", " + second + ")");
    }
}
