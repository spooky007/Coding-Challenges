package MaharishiCodingChallenges;

public class CountSquarePairs {

	public static void main(String[] args) {
		int[] numbers = { 9, 0, 2, -5, 7 };
		System.out.println(countSquarePairs(numbers));
	}

	public static int countSquarePairs(int[] a) {
		if (a.length < 2) {
			return 0;
		}
		int len = a.length;
		int x = 0;
		int y = 0;
		int sum = x + y;
		int squarePairCounter = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] < 1) {
				continue;
			}
			for (int j = 0; j < len; j++) {
				if (a[j] == a[i] || a[j] < 1) {
					continue;
				}
				x = a[i];
				y = a[j];
				sum = x + y;
				if (x < y && x > 0 && y > 0 && isPerfectSquare(sum) == 1) {
					squarePairCounter++;
				}
			}
		}
		return squarePairCounter;
	}

	private static int isPerfectSquare(int sum) {
		double sqrt = Math.sqrt(sum);
		if (sqrt % 1 != 0) {
			return 0;
		} else {
			return 1;
		}
	}
}
