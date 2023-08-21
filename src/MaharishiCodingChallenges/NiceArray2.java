package MaharishiCodingChallenges;

public class NiceArray2 {

	public static void main(String[] a) {
		System.out.println(isNiceArray(new int[] { 21, 3, 7, 9, 11, 4, 6 }));
		System.out.println(isNiceArray(new int[] { 13, 4, 4, 4, 4 }));
		System.out.println(isNiceArray(new int[] { 10, 5, 5 }));
		System.out.println(isNiceArray(new int[] { 0, 6, 8, 20 }));
		System.out.println(isNiceArray(new int[] { 3 }));
		System.out.println();
		System.out.println(isNiceArray(new int[] {8, 5, -5, 5, 3}));
		System.out.println(isNiceArray(new int[] {0, 4, 6, 10, 33}));
		
	}

	private static int isNiceArray(int[] a) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {
				sum += a[i];
			}
		}
		if (sum == a[0]) {
			return 1;
		}
		return 0;
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			} 
		}
		return n > 1;
	}
}
