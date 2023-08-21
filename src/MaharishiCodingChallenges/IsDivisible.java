package MaharishiCodingChallenges;

public class IsDivisible {

	public static void main(String[] args) {
		int[] numbers1 = { 3, 3, 6, 36 };
		int divisor1 = 3;
		int[] numbers2 = { 4 };
		int divisor2 = 2;
		int[] numbers3 = {3, 4, 3, 6, 36};
		int divisor3 = 3;
		int[] numbers4 = {6, 12, 24, 36};
		int divisor4 = 12;
		int[] numbers5 = {};
		int divisor5 = -234; // divisor can be anything
		System.out.println(isDivisible(numbers5, divisor5));
	}

	public static int isDivisible(int[] a, int divisor) {
		int len = a.length;
//		if (len == 0) {
//			return 1;         not necessary
//		}
		int isDivisible = 1;
		for (int i = 0; i < len; i++) {
			if (a[i] % divisor != 0) {
				return 0;
			}
		}
		return isDivisible;
	}

}
