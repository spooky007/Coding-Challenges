package MaharishiCodingChallenges;

public class IsPrimeProduct {

	public static void main(String[] args) {
		System.out.println(isPrimeProduct(22));
	}

	public static int isPrimeProduct(int n) {
		int[] primeFactors = new int[n];
		int index = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && isPrime(i) == 1) {
				primeFactors[index++] = i;
			}
		}
		int productCount = 0;
		for (int i = 0; i < index - 1; i++) {
			for (int j = i + 1; j < index; j++) {
				if (primeFactors[i] * primeFactors[j] == n) {
					productCount++;
				}
			}
		}
		if (productCount > 1) {
			return 0;
		}
		return 1;
	}

	public static int isPrime(int n) {
		if (n < 2) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
