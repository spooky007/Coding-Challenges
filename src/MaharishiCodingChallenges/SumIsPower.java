package MaharishiCodingChallenges;

public class SumIsPower {

	public static void main(String[] args) {
		System.out.println(sumIsPower(new int[] { 8, 8, 8, 8 }));
		System.out.println(sumIsPower(new int[] { 8, 8, 8 }));
	}

	public static boolean sumIsPower(int[] a) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i];
		}
		if (sum == 1) {
			return true;
		}
		int result = 1;
		while (result < sum) {
			result *= 2;
		}
		if (result == sum) {
			return true;
		}
		return false;
	}
}
