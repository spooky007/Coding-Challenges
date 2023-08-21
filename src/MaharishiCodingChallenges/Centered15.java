package MaharishiCodingChallenges;

import java.util.Arrays;

public class Centered15 {

	public static void main(String[] args) {
		int[] numbers1 = { 3, 2, 10, 4, 1, 6, 9 };
		int[] numbers2 = { 2, 10, 4, 1, 6, 9 };
		int[] numbers3 = { 3, 2, 10, 4, 1, 6 };
		int[] numbers4 = { 1, 1, 8, 3, 1, 1 };
		int[] numbers5 = { 9, 15, 6 };
		int[] numbers6 = { 1, 1, 2, 2, 1, 1 };
		int[] numbers7 = { 1, 1, 15, -1, -1 };
		int[] numbers8 = { 15 };

		System.out.println(isCentered15Git(numbers4));
	}

	public static int isCentered15(int[] a) {
		int len = a.length;
		int isCentered = 0;
		int left = 0;
		int right = 0;
		int i = 0;
		while (i < len) {
			int j = i;
			int sum = 0;
			while (j < len) {
				sum += a[j];
				if (sum == 15) {
					left = i;
					right = len - 1 - (j);
					if (left == right) {
						isCentered = 1;
						return isCentered;
					}
				}
				j++;
			}
			i++;
		}
		return isCentered;
	}

	static int isCentered15Git(int[] a) {
		int isCentered15 = 0;
		int lowerIndex = 0;
		int upperIndex = 0;
		int sum = 0;
		if (a.length % 2 == 0) {
			lowerIndex = (a.length / 2) - 1;
			upperIndex = a.length / 2;
		} else {
			lowerIndex = (a.length - 1) / 2;
			upperIndex = lowerIndex;
		}
		while (lowerIndex >= 0 && upperIndex < a.length) {
			sum = 0;
			for (int index = lowerIndex; index <= upperIndex; index++) {
				sum += a[index];
			}
			if (sum == 15) {
				isCentered15 = 1;
				break;
			}
			lowerIndex--;
			upperIndex++;
		}
		return isCentered15;
	}
}
