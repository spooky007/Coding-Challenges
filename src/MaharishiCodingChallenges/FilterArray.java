package MaharishiCodingChallenges;

import java.util.Arrays;

public class FilterArray {

	public static void main(String[] args) {
		int[] numbers1 = { 9, -9 };   // n = 0
		int[] numbers2 = { 9, -9 };   // n = 1
		int[] numbers3 = { 9, -9 };   // n = 2
		int[] numbers4 = { 9, -9 };   // n =3
		int[] numbers5 = { 9, -9 };  // n = 4
		int[] numbers6 = { 9, -9, 5 };  // n = 3
		int[] numbers7 = { 0, 9, 12, 18, -6 };  // n = 11

//		System.out.println(Arrays.toString(getExponentArray(88)));
		System.out.println(Arrays.toString(filterArray(numbers5, 4)));
	}

	private static int[] filterArray(int[] a, int n) {
		int len = a.length;
		int j = 0;
		int expoLen = getExponentArray(n).length;
		int[] filterArray = new int[expoLen];
		while (j < expoLen) {
			if (getExponentArray(n)[j] < len) {
				filterArray[j] = a[getExponentArray(n)[j]];
			} else {
				return null;
			}
			j++;
		}

		return filterArray;
	}

	private static int[] getExponentArray(int n) {
		int quotient = n;
		int index = 0;
		while (quotient != 0) {
			quotient /= 2;
			index++;
		}
		quotient = n;
		int[] exponents = new int[index];
		int count = 0;
		index = 0;
		while (quotient != 0) {
			int remainder = quotient % 2;
			quotient /= 2;
			if (remainder != 0) {
				exponents[count++] = index;
			}
			index++;
		}
		int[] newExponents = new int[count];
		for (int i = 0; i < count; i++) {
			newExponents[i] = exponents[i];
		}
		return newExponents;
	}
}
