package MaharishiCodingChallenges;

public class IsMagicArray {

	public static void main(String[] args) {
		System.out.println(isMagicArray(new int[] { 21, 3, 7, 9, 11, 4, 6 }));
		System.out.println(isMagicArray(new int[] { 13, 4, 4, 4, 4 }));
		System.out.println(isMagicArray(new int[]{10, 5, 5}));
		System.out.println(isMagicArray(new int[]{0, 6, 8, 20}));
		System.out.println(isMagicArray(new int[]{3}));
		
		System.out.println(isMagicArray(new int[] {8, 5, -5, 5, 3}));
	}

	public static int isMagicArray(int[] a) {
		int len = a.length;
		if (len < 1) {
			return 0;
		}
		int sum = 0;
		int primeCount = 0;
		int firstElement = a[0];
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i]) == 1) {
				sum += a[i];
				primeCount++;
			}
		}
		if (primeCount != 0 && sum != firstElement) {
			return 0;
		}
		return 1;

	}

	public static int isPrime(int n) {
		int isPrime = 1;
		int i = 2;
		if (n < 2) {
			return 0;
		}
		while (i < n) {
			if (n % i == 0) {
				return 0;
			}
			i++;
		}
		return isPrime;
	}
}
