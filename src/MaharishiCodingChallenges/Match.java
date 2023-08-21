package MaharishiCodingChallenges;

public class Match {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, -5, -5, 2, 3, 18 };
		int[] P1 = { 3, -2, 3 };
		int[] P2 = { 2, 1, -1, -1, 2, 1 };
		int[] P3 = {1, 2, -1, -1, 1, 2};
		int[] P4 = {2, 1, -2, 3};
		int[] P5 = {1, 1, 1, -1, -1, 1, 1, 1};
		System.out.println(matches(A, P5));
	}

	public static int matches(int[] a, int[] p) {
		int lenA = a.length;
		int lenP = p.length;
		int match = 1;
		int sum = 0;
		for (int i = 0; i < lenP; i++) {
			sum += Math.abs(p[i]);
		}
		if (sum != lenA) {
			return match = 0;
		}
		int sequence = 0;
		int length = 0;
		for (int j = 0; j < lenP; j++) {
			length += Math.abs(p[j]);
			int sign = p[j];
			while (sequence < length) {
				if (sign < 0 && a[sequence] > 0) {
					return match = 0;
				}
				if (sign > 0 && a[sequence] < 0) {
					return match = 0;
				}
				sequence++;
			}
		}
		return match;
	}
}
