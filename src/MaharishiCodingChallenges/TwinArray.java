package MaharishiCodingChallenges;

public class TwinArray {

	public static void main(String[] args) {
		System.out.println(isTwin(new int[] {3, 5, 8, 10, 27}));
		System.out.println(isTwin(new int[] {11, 9, 12, 13, 23}));
		System.out.println(isTwin(new int[] {5, 3, 14, 7, 18, 67}));
		System.out.println();
		System.out.println(isTwin(new int[] {13, 14, 15, 3, 5}));
		System.out.println(isTwin(new int[] {1, 17, 8, 25, 67}));
	}

	public static int isTwin(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int found = 0;
			if (isPrime(a[i]) == 1) {
				int twinPrime1 = a[i] + 2;
				int twinPrime2 = a[i] - 2;
				if (isPrime(twinPrime1) == 1) {
					for (int k = 0; k < len; k++) {
						if (a[k] == twinPrime1) {
							found = 1;
							break;
						}
					}
				} 
				if (isPrime(twinPrime2) == 1 && found == 0) {
					for (int k = 0; k < len; k++) {
						if (a[k] == twinPrime2) {
							found = 1;
							break;
						}
					}
				}
				if (isPrime(twinPrime1) == 0 && isPrime(twinPrime2) == 0) {
					found = 1;
				}
				if (found == 0) {
					return 0;
				}
			}
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
