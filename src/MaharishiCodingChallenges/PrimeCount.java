package MaharishiCodingChallenges;

public class PrimeCount {

	public static void main(String[] args) {
		System.out.println(primeCount(10, 20));
	}

	private static int primeCount(int i, int j) {
		if (j == 0 || j == 1) {
			return 0;
		}
		if (i > j) {
			return 0;
		}
		int count = 0;
		boolean isPrime = true;
		for (int k = i; k < j + 1; k++) {
			if (k < 2) {
				continue;
			}
			for (int l = 2; l < k; l++) {
				if (k % l == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				count++;
			}
			// reset isPrime to true
			isPrime = true;
		}
		return count;
	}
}
