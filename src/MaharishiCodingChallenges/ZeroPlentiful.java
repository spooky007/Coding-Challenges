package MaharishiCodingChallenges;

public class ZeroPlentiful {

	public static void main(String[] args) {
		int[] numbers1 = { 0, 0, 0, 0, 0 };
		int[] numbers2 = { 1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12 };
		int[] numbers3 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0 };
		int[] numbers4 = { 1, 2, 3, 4 };
		int[] numbers5 = { 1, 0, 0, 0, 2, 0, 0, 0, 0 };
		int[] numbers6 = { 0 };
		int[] numbers7 = {};
		System.out.println(zeroPlentiful(numbers1));
		System.out.println(zeroPlentiful(numbers2));
		System.out.println(zeroPlentiful(numbers3));
		System.out.println(zeroPlentiful(numbers4));
		System.out.println(zeroPlentiful(numbers5));
		System.out.println(zeroPlentiful(numbers6));
		System.out.println(zeroPlentiful(numbers7));
	}

	public static int zeroPlentiful(int[] a) {
		int len = a.length;
		if (len < 4) {
			return 0;
		}
		int zeroCount = 0;
		int zeroLen = 0;
		int k = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				zeroLen++;
			}
			if (a[i] != 0) {
				if (zeroLen >= 4) {
					zeroCount++;
					zeroLen = 0;
				} else if (zeroLen == 0) {
					continue;
				} else {
					return 0;
				}
			}
			if (i == len - 1) {
				if (zeroLen >= 4) {
					zeroCount++;
				}
				if (zeroLen < 4 && zeroLen > 0) {
					return 0;
				}
			}
		}
		return zeroCount;
	}
}
