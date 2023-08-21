package MaharishiCodingChallenges;

public class IsOneBalanced {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 1, 1, 2, 3, -18, 45, 1 };
		int[] numbers2 = { 1, 1, 1, 2, 3, -18, 45, 1, 0 };
		int[] numbers3 = { 1, 1, 2, 3, 1, -18, 26, 1 };
		int[] numbers4 = {};
		int[] numbers5 = { 3, 4, 1, 1 };
		int[] numbers6 = { 1, 1, 3, 4 };
		int[] numbers7 = { 3, 3, 3, 3, 3, 3 };
		int[] numbers8 = { 1, 1, 1, 1, 1, 1 };

		System.out.println(isOneBalanced1(numbers1));
//		System.out.println(isOneBalanced1(numbers2));
//		System.out.println(isOneBalanced1(numbers3));
//		System.out.println(isOneBalanced1(numbers4));
//		System.out.println(isOneBalanced1(numbers5));
//		System.out.println(isOneBalanced1(numbers6));
//		System.out.println(isOneBalanced1(numbers7));
//		System.out.println(isOneBalanced1(numbers8));
	}

	public static int isOneBalanced(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 1;
		}
		int isOneBalanced = 1;
		int flag1 = a[0] == 1 ? 1 : 0;
		int flag2 = 0, flag3 = 0, leftZeroes = 0, rightZeroes = 0, middle = 0;
		if (a[0] != 1 && a[len - 1] != 1) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] == 1 && flag1 == 1 && flag2 == 0 && flag3 == 0) {
				leftZeroes++;
			}
			if (a[i] != 1) {
				flag2 = 1;
				if (flag3 == 0) {
					middle++;
				} else {
					return 0;
				}
			}
			if (a[i] == 1 && flag2 == 1) {
				flag3 = 1;
				rightZeroes++;

			}
		}
		if (middle != rightZeroes + leftZeroes) {
			return 0;
		} else {
			return isOneBalanced;
		}
	}

	public static int isOneBalanced1(int[] a) {
		int total1s = 0;
		int totalNon1s = 0;
		boolean non1Start = false;
		boolean non1End = false;
		if (a.length == 0)
			return 1;
		for (int number : a) {
			if (number == 1) {
				if (non1Start) {
					non1End = true;
				}
				total1s++;
			} else {
				if (non1End) {
					return 0;
				}
				non1Start = true;
				totalNon1s++;
			}
		}
		if (total1s != totalNon1s)
			return 0;
		return 1;
	}
}