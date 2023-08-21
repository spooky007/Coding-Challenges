package MaharishiCodingChallenges;

public class IsPrimeHappy {

	public static void main(String[] args) {
		System.out.println(isPrimeHappy(5));
		System.out.println(isPrimeHappy(25));
		System.out.println(isPrimeHappy(32));
		System.out.println(isPrimeHappy(8));
		System.out.println(isPrimeHappy(2));
	}
	
	public static int isPrimeHappy(int n) {
		int sum = 0;
		int isPrimeHappy = 0;
		int i = 2;
		if (n <= 2) {
			return 0;
		} 
		while (i < n) {
			if (isPrime(i) == 1) {
				sum += i;
			}
			i++;
		}
		if (sum % n == 0) {
			return 1;
		} else {			
			return isPrimeHappy;
		}
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
}
