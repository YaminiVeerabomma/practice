package www.exception;

import java.util.Scanner;
//import java.util.Exception;
import java.util.InputMismatchException;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } 
//        catch (InputMismatchException e) {
//            System.out.println("InputMismatchException"+e);
//        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException"+e);
        }
        finally{
        	scanner.close();
        	}
    }
}
