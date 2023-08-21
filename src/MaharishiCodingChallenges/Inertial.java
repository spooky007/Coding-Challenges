package MaharishiCodingChallenges;

public class Inertial {

	public static void main(String[] args) {
		int[] numbers = { 1 };
		int[] numbers1 = { 2 };
		int[] numbers2 = { 1, 2, 3, 4 };
		int[] numbers3 = { 1, 1, 1, 1, 1, 1, 2 };
		int[] numbers4 = { 2, 12, 4, 6, 8, 11 };
		int[] numbers5 = { 2, 12, 12, 4, 6, 8, 11 };
		int[] numbers6 = { -2, -4, -6, -8, -11 };
		int[] numbers7 = { 2, 3, 5, 7 };
		int[] numbers8 = { 2, 4, 6, 8, 10 };
		System.out.println(isInertial1(numbers3));
	}

	public static int isInertial1(int[] a) {
		int len = a.length;
		int isInertial = 1;
		int noOfEvens = 0;
		int noOfOdds = 0;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
			if (a[i] % 2 == 0) {
				noOfEvens++;
			}
			if (a[i] % 2 != 0) {
				noOfOdds++;
			}
		}
		// check if maxValue is even and that there is at least one odd
		if (maxValue % 2 != 0 || noOfOdds == 0) {
			return isInertial = 0;
		}
		int[] evens = new int[noOfEvens - 1]; // evens minus maxValue
		int[] odds = new int[noOfOdds];
		int m = 0, n = 0;
		for (int j = 0; j < len; j++) {
			if (a[j] % 2 == 0 && a[j] != maxValue) {
				evens[m++] = a[j];
			} 
			if(a[j] % 2 != 0) {
				odds[n++] = a[j];
			}
		}
		m = 0; n = 0;
		// check if all odds are greater than all evens that are not max value
		for (n = 0; n < noOfOdds; n++) {
			for (m = 0; m < noOfEvens - 1; m++) {
				if(odds[n] < evens[m]) {
					isInertial = 0;
				}
			}
		}
		return isInertial;
	}
}
