package MaharishiCodingChallenges;

public class IsFactorialPrime {

	public static void main(String[] args) {
//		System.out.println(isFactorialPrime(2));
//		System.out.println(isFactorialPrime(3));
//		System.out.println(isFactorialPrime(7));
//		System.out.println(isFactorialPrime(8));
//		System.out.println(isFactorialPrime(11));
//		System.out.println(isFactorialPrime(721));
		
		System.out.println(factorial(0));

	}

	public static int isFactorialPrime(int n) {
		if (isPrime(n) == 0) {
			return 0;
		}
		int isFactorialPrime = 0;
		int i = 1;
		while (factorial(i) + 1 < n) {
			i++;
		}
		if (factorial(i) + 1 == n) {
			return 1;
		}
		return isFactorialPrime;
	}

	public static int isPrime(int n) {
		int isPrime = 1;
		int count = 0;
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				count++;
			}
			if (count > 0) {
				return isPrime = 0;
			}
			i++;
		}
		return isPrime;
	}

	public static int factorial(int n) {
		int factorial = n;
		if (factorial == 0 || factorial == 1) {
			return 1;
		}
		factorial = factorial * factorial(n - 1);
		return factorial;
	}
}
