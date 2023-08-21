package MaharishiCodingChallenges;

public class ZeroBalanced {

	public static void main(String[] args) {
		System.out.println(isZeroBalanced(new int[] { 1, 2, -2, -1 }));
		System.out.println(isZeroBalanced(new int[] { -3, 1, 2, -2, -1, 3 }));
		System.out.println(isZeroBalanced(new int[] { 3, 4, -2, -3, -2 }));
		System.out.println(isZeroBalanced(new int[] { 0, 0, 0, 0, 0, 0 }));
		System.out.println(isZeroBalanced(new int[] { 3, -3, -3 }));
		System.out.println(isZeroBalanced(new int[] { 3 }));
		System.out.println(isZeroBalanced(new int[] {}));

		System.out.println();
		System.out.println(isZeroBalanced(new int[] { 1, 2, 0, -2, -1 }));

	}

	public static int isZeroBalanced1(int[] a) {
		int len = a.length;
		if (len < 2 || len % 2 == 1) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i];
			int j = 0;
			int found = 0;
			while (j < len) {
				if (a[i] == -a[j]) {
					found = 1;
					break;
				}
				j++;
			}
			if (found == 0) {
				return 0;
			}
		}
		if (sum != 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static int isZeroBalanced2(int[] a) {
		int len = a.length;
		if (len < 2 || len % 2 == 1) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			int j = 0;
			int found = 0;
			while (j < len) {
				if (a[i] == -a[j]) {
					found = 1;
					break;
				}
				j++;
			}
			if (found == 0) {
				return 0;
			}
		}
			return 1;
		}

	static int isZeroBalanced(int[] a) {

		if (a.length <= 1)
			return 0;

		int sum = 0;
		boolean negativeFlag = false;
		for (int i = 0; i < a.length; i++) {
			negativeFlag = a[i] <= 0;

			sum += a[i];
			for (int j = 0; j < a.length; j++) {
				if (a[i] > 0 && a[i] == -a[j]) {
					negativeFlag = true;
					break;
				}
			}
			if (!negativeFlag)
				return 0;
		}

		if (sum == 0)
			return 1;
		return 0;
	}
}
