package MaharishiCodingChallenges;

public class GutherieSequence {

	public static void main(String[] args) {
		int[] numbers1 = { 8, 4, 2, 1 };
		int[] numbers2 = { 8, 17, 4, 1 };
		int[] numbers3 = { 8, 4, 1 };
		int[] numbers4 = { 8, 4, 2 };
		int[] numbers5 = { 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 };
		System.out.println(isGutherieSequence(numbers5));
	}

	public static int isGutherieSequence(int[] a) {
		int len = a.length;
		if (a[len - 1] != 1) {
			return 0;
		}
		for (int i = 0; i < len - 1; i++) {
			if (a[i] % 2 == 0) {
				if (a[i + 1] != a[i] / 2) {
					return 0;
				}
			} else if (a[i] % 2 != 0) {
				if (a[i + 1] != (a[i] * 3) + 1) {
					return 0;
				}
			}
		}
		return 1;
	}
}
