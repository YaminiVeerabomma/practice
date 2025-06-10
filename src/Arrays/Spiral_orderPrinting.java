package Arrays;
import java.util.*;

public class Spiral_orderPrinting {
	public int[][] generateMatrix(int A) {
        int[][] mat = new int[A][A];

        int e = 1;
        int r = 0, c = 0;
        int size = A;

        while (A > 1) {
            // right
            for (int i = 0; i < A - 1; i++) {
                mat[r][c] = e++;
                c++;
            }

            // down
            for (int i = 0; i < A - 1; i++) {
                mat[r][c] = e++;
                r++;
            }

            // left
            for (int i = 0; i < A - 1; i++) {
                mat[r][c] = e++;
                c--;
            }

            // up
            for (int i = 0; i < A - 1; i++) {
                mat[r][c] = e++;
                r--;
            }

            r++;
            c++;
            A -= 2;
        }

        if (A == 1)
            mat[r][c] = e;

        return mat;
    }
	public static void main(String[] args) {
		Spiral_orderPrinting  spo= new Spiral_orderPrinting ();
        int A = 5; // You can change the size here
        int[][] result = spo.generateMatrix(A);

        System.out.println("Spiral Matrix of size " + A + "x" + A + ":");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}