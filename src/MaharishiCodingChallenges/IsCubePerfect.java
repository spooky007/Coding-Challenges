package MaharishiCodingChallenges;

public class IsCubePerfect {

	public static void main(String[] args) {
		System.out.println(isCubePerfect(new int[] { -1, 1, -8, -27, 8 }));
		System.out.println(isCubePerfect(new int[] { 1, 1, 1, 1 }));
		System.out.println(isCubePerfect(new int[] { 64 }));
		System.out.println(isCubePerfect(new int[] { 63 }));
		System.out.println(isCubePerfect(new int[] { -1, 0, 1 }));
		System.out.println(isCubePerfect(new int[] {}));
		System.out.println(isCubePerfect(new int[] { 3, 7, 21, 36 }));

	}

	public static int isCubePerfect(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (isCube(a[i]) == 0) {
				return 0;
			}
		}
		return 1;
	}

	private static int isCube(int n) {
		n = n >= 0 ? n : -n;
		if (n == 0 || n == 1) {
			return 1;
		}
		for (int i = 2; i < n; i++) {
			if (n == i * i * i) {
				return 1;
			}
		}
		return 0;
	}
}
