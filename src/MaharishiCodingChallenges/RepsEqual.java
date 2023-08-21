package MaharishiCodingChallenges;

import java.util.Arrays;

public class RepsEqual {

	public static void main(String[] args) {
		int[] numbers1 = { 3, 2, 0, 5, 3 };
		int[] numbers2 = { 3, 2, 0, 5};
		int[] numbers3 = { 3, 2, 0, 5, 3, 4};
		int[] numbers4 = { 0, 3, 2, 0, 5, 3, 4};
		System.out.println(repsEqual(numbers4, 32053));

	}

	public static int repsEqual(int[] a, int n) {
		int arrLength = a.length;
		int len = getLength(n);
		if (arrLength != len) {
			return 0;
		}
		int[] reps = new int[len];
		int i = arrLength - 1;
		int newNumber = n;
		while (newNumber != 0) {
			reps[i--] = newNumber % 10;
			newNumber = newNumber / 10;
		}
		if (Arrays.equals(a, reps)) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int getLength(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
