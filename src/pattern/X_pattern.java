package pattern;

public class X_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10;
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                 
                if (i == j || i + j == size - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}