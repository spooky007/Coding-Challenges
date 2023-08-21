package MaharishiCodingChallenges;

public class HasNValues {

	public static void main(String[] args) {
		System.out.println(hasNValues(new int[] { 1, 2, 2, 1 }, 2));
		System.out.println(hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 3));
		System.out.println(hasNValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 10));
		System.out.println(hasNValues(new int[] { 1, 2, 2, 1 }, 3));
		System.out.println(hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 2));
		System.out.println(hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 20));
	}

	public static int hasNValues(int[] a, int n) {
		int len = a.length;
		if (len < n) {
			return 0;
		}
		int[] values = new int[len];
		int exists = 0;
		int k = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < k; j++) {
				if (a[i] == values[j]) {
					exists = 1;
					break;
				}
			}
			if (exists == 0) {
				values[k++] = a[i];
			}
			exists = 0;
		}
		if (k == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
