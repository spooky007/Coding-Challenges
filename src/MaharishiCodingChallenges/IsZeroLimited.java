package MaharishiCodingChallenges;

public class IsZeroLimited {

	public static void main(String[] args) {
		System.out.println(isZeroLimited(new int[] { 0, 0, 0, 0, 0 }));
		System.out.println(isZeroLimited(new int[] { 1, 0 }));
		System.out.println(isZeroLimited(new int[] { 0, 1 }));
		System.out.println(isZeroLimited(new int[] { 5 }));
		System.out.println(isZeroLimited(new int[] { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0 }));
		System.out.println(isZeroLimited(new int[] {}));
	}

	private static int isZeroLimited(int[] a) {
		int len = a.length;
		int n = 0;
		for (int i = 0; i < len; i++) {
			if (i == 3 * n + 1) {
				if (a[i] == 0) {
					n++;
				} else {
					return 0;
				}
			} else {
				if(a[i] == 0) {
					return 0;
				}
			}
		}
		return 1;
	}
}
