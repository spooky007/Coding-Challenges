package MaharishiCodingChallenges;

import java.util.Arrays;

public class EncodeArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(encodeArray(0)));
		System.out.println(Arrays.toString(encodeArray(1)));
		System.out.println(Arrays.toString(encodeArray(-1)));
		System.out.println(Arrays.toString(encodeArray(100001)));
		System.out.println(Arrays.toString(encodeArray(-999)));
	}

	public static int[] encodeArray(int n) {
		int arraySize = 0;

		int quotient = Math.abs(n);
		int numberCount = 0;
		while (quotient != 0) {
			int remainder = quotient % 10;
			arraySize += remainder + 1;
			quotient /= 10;
			numberCount++;
		}
		if (n == 0) {
			return new int[] {1};
		}
		int[] numbers = new int[numberCount];
		int i = numbers.length - 1;
		quotient = Math.abs(n);
		while (quotient != 0) {
			int remainder = quotient % 10;
			numbers[i--] = remainder;
			quotient /= 10;
		}
		if (n < 1) {
			arraySize++;
		}
		int[] encodedArray = new int[arraySize];
		int j = 0;
		if (n < 0) {
			encodedArray[j++] = -1;
		}
		for (int k = 0; k < numbers.length; k++) {
			int remainder = numbers[k];
			while (remainder > 0) {
				encodedArray[j++] = 0;
				remainder--;
			}
			encodedArray[j++] = 1;
			quotient /= 10;
		}
		return encodedArray;
	}
}