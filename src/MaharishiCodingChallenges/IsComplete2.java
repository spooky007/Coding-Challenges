package MaharishiCodingChallenges;

public class IsComplete2 {
	public static void main(String[] args) {
		System.out.println(isComplete(new int[] { 2, 3, 2, 4, 11, 6, 10, 9, 8 }));
		System.out.println(isComplete(new int[] { 2, 3, 3, 6 }));
		System.out.println(isComplete(new int[] { 2, -3, 4, 3, 6 }));
	}

	public static int isComplete(int[] a) {
		int len = a.length;
		int maxEven = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] < 1) {
				return 0;
			}
			if (a[i] % 2 == 0) {
				if (a[i] > maxEven) {
					maxEven = a[i];
				}
			}
		}
		for (int i = maxEven; i > 0; i -= 2) {
			int found = 0;
			for (int k = 0; k < len; k++) {
				if (a[k] == i) {
					found = 1;
				}
			}
			if (found == 0) {
				return 0;
			}
		}
		return 1;
	}
}
