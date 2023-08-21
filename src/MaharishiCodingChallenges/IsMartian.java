package MaharishiCodingChallenges;

public class IsMartian {

	public static void main(String[] args) {
		System.out.println(isMartian(new int[] { 1, 3 }));
		System.out.println(isMartian(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 }));
		System.out.println(isMartian(new int[] { 1, 3, 2 }));
		System.out.println(isMartian(new int[] { 1, 3, 2, 2, 1, 5, 1, 5 }));
		System.out.println(isMartian(new int[] { 1, 2, -18, -18, 1, 2 }));
		System.out.println(isMartian(new int[] {}));
		System.out.println(isMartian(new int[] { 1 }));
		System.out.println(isMartian(new int[] { 2 }));

	}

	public static int isMartian(int[] a) {
		int len = a.length;
		int no1s = 0;
		int no2s = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				no1s++;
			}
			if (a[i] == 2) {
				no2s++;
			}
			if (i != 0 && a[i] == a[i - 1]) {
				return 0;
			}
		}
		if (no1s > no2s) {
			return 1;
		} else {
			return 0;
		}
	}
}
