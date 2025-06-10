package string;

public class FindPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10;
	        int count = countPrimes(n);
	        System.out.println("Number of primes less than " + n + ": " + count);
	    }

	    public static int countPrimes(int n) {
	        int count = 0;
	        for (int i = 2; i < n; i++) {
	            if (isPrime(i)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	}