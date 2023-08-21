package MaharishiCodingChallenges;

public class DualArray1 {

	public static void main(String[] args) {
		System.out.println(isDual(new int[] { 1, 2, 3, 0 }));
		System.out.println(isDual(new int[] { 1, 2, 2, 1, 3, 0 }));
		System.out.println(isDual(new int[] { 1, 1, 2, 2 }));
		System.out.println(isDual(new int[] { 1, 2, 1 }));
		System.out.println(isDual(new int[] {}));
		System.out.println(isDual(new int[] {1, 2}));
	}

	public static int isDual(int[] a) {
		int len = a.length;
		if (len % 2 == 1) {
			return 0;
		}
		if (len == 2 || len == 0) {
			return 1;
		}
		int temp = a[0] + a[1];
		for (int i = 2; i < len - 1; i += 2) {
			if (a[i] + a[i + 1] != temp) {
				return 0;
			}
		}
		return 1;
	}
}
