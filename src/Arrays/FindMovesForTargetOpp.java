package Arrays;

public class FindMovesForTargetOpp {

    public static int reachNumber(int target) {
        target = Math.abs(target);  // symmetry for negative

        // Step 1: Use formula to estimate minimum n
        int n = (int) Math.ceil((Math.sqrt(8.0 * target + 1) - 1) / 2);

        int sum = n * (n + 1) / 2;

        // Step 2: If parity matches, we are done
        if ((sum - target) % 2 == 0) {
            return n;
        }

        // Step 3: Try one more step (n + 1)
        sum += (n + 1);
        if ((sum - target) % 2 == 0) {
            return n + 1;
        }

        // Step 4: Worst case → need two more steps (n + 2)
        return n + 2;
    }

    public static void main(String[] args) {
        int target = 8;
        System.out.println("Minimum moves to reach " + target + " = " + reachNumber(target));
    }
}