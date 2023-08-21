package MaharishiCodingChallenges;

public class DecodeArray {

	public static void main(String[] args) {
		int[] numbers1 = { 0, -3, 0, -4, 0 };
		int[] numbers2 = { -1, 5, 8, 17, 15 };
		int[] numbers3 = { 1, 5, 8, 17, 15 };
		int[] numbers4 = { 111, 115, 118, 127, 125 };
		int[] numbers5 = { 1, 1 };
		System.out.println(decodeArray(numbers1));
		System.out.println(decodeArray(numbers2));
		System.out.println(decodeArray(numbers3));
		System.out.println(decodeArray(numbers4));
		System.out.println(decodeArray(numbers5));
	}

	public static int decodeArray(int[] a) {
		int len = a.length;
		int sum = 0;
		int power = len - 2;
		for (int i = 0; i < len - 1; i++) {
			sum += Math.abs(a[i] - a[i + 1]) * Math.pow(10, power--);
		}
		if (a[0] < 0) {
			return -sum;
		} else {
			return sum;
		}
	}

	static int decodeArray1(int[] a) {
		int sum = 0;

		for (int i = a.length - 1; i > 0; i--) {
			int digit = (a[i] - a[i - 1]) > 0 ? (a[i] - a[i - 1]) : -(a[i] - a[i - 1]);

			for (int j = i; j < a.length - 1; j++) {
				digit *= 10;
			}
			sum += digit;
		}
		if (a[0] < 0)
			return -sum;
		return sum;
	}
}
