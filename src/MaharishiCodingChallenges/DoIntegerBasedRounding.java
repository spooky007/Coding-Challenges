package MaharishiCodingChallenges;

import java.util.Arrays;

public class DoIntegerBasedRounding {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4, 5 };
		int n1 = 2;
		int[] numbers2 = { 1, 2, 3, 4, 5 };
		int n2 = 3;
		int[] numbers3 = { 1, 2, 3, 4, 5 };
		int n3 = -3;
		int[] numbers4 = { -1, -2, -3, -4, -5 };
		int n4 = 3;
		int[] numbers5 = { -18, 1, 2, 3, 4, 5 };
		int n5 = 4;
		int[] numbers6 = { 1, 2, 3, 4, 5 };
		int n6 = 5;
		int[] numbers7 = { 1, 2, 3, 4, 5 };
		int n7 = 100;
		System.out.println(Arrays.toString(doIntegerBasedRounding(numbers1, n1)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(numbers2, n2)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(numbers3, n3)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(numbers4, n4)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(numbers5, n5)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(numbers6, n6)));
		System.out.println(Arrays.toString(doIntegerBasedRounding(numbers7, n7)));
	}

	public static int[] doIntegerBasedRounding(int[] a, int n) {
		int len = a.length;
		int[] roundedArray = new int[len];
		int j = 0;
		if (n <= 0) {
			return a;
		}
		int biggerMultiple = n;
		int smallerMultiple = n;
		for (int i = 0; i < len; i++) {
			if (a[i] <= n && a[i] >= 0) {
				if (biggerMultiple - a[i] <= a[i] - 0) {
					roundedArray[j++] = biggerMultiple;
				} else {
					roundedArray[j++] = 0;
				}
			} else if (a[i] < 0) {
				roundedArray[j++] = a[i];
			} else {
				while (biggerMultiple < a[i]) {
					biggerMultiple += n;
				}
				smallerMultiple = biggerMultiple - n;
				if ((biggerMultiple - a[i]) <= (a[i] - smallerMultiple)) {
					roundedArray[j++] = biggerMultiple;
				} else {
					roundedArray[j++] = smallerMultiple;
				}
			}
		}
		return roundedArray;
	}
}
