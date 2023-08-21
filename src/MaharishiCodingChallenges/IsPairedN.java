package MaharishiCodingChallenges;

public class IsPairedN {

	public static void main(String[] args) {
		System.out.println(isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 5));
		System.out.println(isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 6));
		System.out.println(isPairedN(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, 6));
		System.out.println(isPairedN(new int[] { 1, 4, 1 }, 5));
		System.out.println(isPairedN(new int[] { 8, 8, 8, 8, 7, 7, 7 }, 15));
		System.out.println(isPairedN(new int[] { 8, -8, 8, 8, 7, 7, -7 }, -15));
		System.out.println(isPairedN(new int[] { 3 }, 3));
		System.out.println(isPairedN(new int[] {}, 0));
		System.out.println(isPairedN(new int[] {}, 0));
		System.out.println(isPairedN(new int[] { 1, 4, 3, 3, 5, 5 }, 8));
	}

	public static int isPairedN(int[] a, int n) {
		int len = a.length;
		if (len <= 1 || n > 2 * len - 3 || n < 0) {
            return 0;
		}
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (i + j != n) {
					continue;
				} else {
					if (a[i] + a[j] == n) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}
