package MaharishiCodingChallenges;

public class BunkerArray1 {

	public static void main(String[] args) {
		System.out.println(isBunker(new int[] { 7, 6, 10, 1 }));
		System.out.println(isBunker(new int[] { 7, 6, 10 }));
		System.out.println(isBunker(new int[] { 6, 10, 1 }));
		System.out.println(isBunker(new int[] {3, 7, 1, 8, 1}));
	}

	private static int isBunker(int[] a) {
		int len = a.length;
		int primeCount = 0;
		int count1 = 0;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i]) == 1) {
				primeCount++;
				if (count1 > 0) {
					return 1;
				}
			}
			if (a[i] == 1) {
				count1++;
				if (primeCount > 0) {
					return 1;
				}
			}
		}
		return 0;
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
