package Arrays;

public class FindMovesForTarget {

    public static int reachNumber(int target) {
    
        target = Math.abs(target); // symmetrical for positive & negative

        int sum = 0;
        int moves = 0;

        // Keep adding moves until sum >= target AND (sum - target) is even
        while (sum < target || (sum - target) % 2 != 0) {
            moves++;
            sum += moves;
        }

       return moves;
    }

    public static void main(String[] args) {
        int target = 7;
        int moves = reachNumber(target);
        System.out.println("Minimum moves to reach " + target + " = " + moves);
    }
}

