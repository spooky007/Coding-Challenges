package MaharishiCodingChallenges;

public class LargestDifferenceOfEvens {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 3, 5, 9 };
		int[] numbers2 = { 1, 18, 5, 7, 33 };
		int[] numbers3 = { 2, 2, 2, 2 };
		int[] numbers4 = { 1, 2, 1, 2, 1, 4, 1, 6, 4 };

		System.out.println(largestDifferenceOfEvens(numbers1));
		System.out.println(largestDifferenceOfEvens(numbers2));
		System.out.println(largestDifferenceOfEvens(numbers3));
		System.out.println(largestDifferenceOfEvens(numbers4));
	}

	public static int largestDifferenceOfEvens(int[] a) {
		int len = a.length;
		int largestDiff = 0;
		int evenCount = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				evenCount++;
				int j = i + 1;
				int diff = 0;
				while (j < len) {
					if (a[j] % 2 == 0) {
						evenCount++;
						if (a[i] > a[j]) {
							diff = a[i] - a[j];
						} else {
							diff = a[j] - a[i];
						}
					}
					if (diff > largestDiff) {
						largestDiff = diff;
					}
					j++;
					if (j == len - 1 && evenCount <= 1) {
						return -1;
					}
				}
			}
			if (i == len - 1 && evenCount == 0) {
				return -1;
			}
		}
		return largestDiff;
	}
}
