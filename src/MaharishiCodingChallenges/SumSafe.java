package MaharishiCodingChallenges;

public class SumSafe {

	public static void main(String[] args) {
		int[] numbers = { 5, -5, 0 };
		System.out.println(isSumSafe(numbers));
		System.out.println(isSumSafe(new int[] { 5, -2, 1 }));
	}

	public static int isSumSafe(int[] a) {
		int len = a.length;
		int isSumSafe = 1;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i];
		}
		for (int i = 0; i < len; i++) {
			if (a[i] == sum) {
				return isSumSafe = 0;
			}
		}
		return isSumSafe;
	}
}
