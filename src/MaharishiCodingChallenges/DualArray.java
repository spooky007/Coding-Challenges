package MaharishiCodingChallenges;

public class DualArray {

	public static void main(String[] args) {
		System.out.println(isDual(new int[] { 1, 2, 1, 3, 3, 2 }));
		System.out.println(isDual(new int[] { 2, 5, 2, 5, 5 }));
		System.out.println(isDual(new int[] { 3, 1, 1, 2, 2 }));
	}

	public static int isDual(int[] a) {
		int len = a.length;
		if (len % 2 != 0) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			int count = 0;
			for (int k = 0; k < len; k++) {
				if (a[i] == a[k]) {
					count++;
				}
			}
			if (count != 2) {
				return 0;
			}
		}
		return 1;
	}
}
