package MaharishiCodingChallenges;

public class FactorEqual {

	public static void main(String[] args) {
		System.out.println(factorEqual(10, 33));
		System.out.println(factorEqual(9, 10));
		System.out.println(factorEqual(10, 8));
	}

	private static int factorEqual(int m, int n) {
		if (numOfFactors(m) == numOfFactors(n)) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int numOfFactors(int n) {
		int factorCount = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factorCount++;
			}
		}
		return factorCount;
	}
}
