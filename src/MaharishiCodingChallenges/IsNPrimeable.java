package MaharishiCodingChallenges;

public class IsNPrimeable {

	public static void main(String[] args) {

		System.out.println(isNPrimeable(new int[] {5, 15, 27}, 2));
		System.out.println(isNPrimeable(new int[] {5, 15, 27}, 3));
		System.out.println(isNPrimeable(new int[] {5, 15, 26}, 2));
		System.out.println(isNPrimeable(new int[] {1, 1, 1, 1, 1, 1, 1}, 2));
		System.out.println(isNPrimeable(new int[] {}, 2));
	}

	public static int isNPrimeable(int[] a, int n) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if(isPrime(a[i] + n) == 0) {
				return 0;
			}
		}
		return 1;
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
