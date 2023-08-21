package MaharishiCodingChallenges;

public class MeeraArray2 {

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] { 7, 6, 0, 10, 1 }));
		System.out.println(isMeera(new int[] { 6, 10, 1 }));
		System.out.println(isMeera(new int[] { 7, 6, 10 }));
		System.out.println(isMeera(new int[] { 6, 10, 0 }));
		System.out.println(isMeera(new int[] { 3, 7, 0, 8, 0, 5 }));
	}

	public static int isMeera(int[] a) {
		int len = a.length;
		int primeCount = 0;
		int zeroCount = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				zeroCount++;
			}
			if (isPrime(a[i]) == 1) {
				primeCount++;
			}
		}
		if (primeCount == 0 && zeroCount > 0 || primeCount > 0 && zeroCount == 0) {
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
