package MaharishiCodingChallenges;

public class IsOddValent {

	public static void main(String[] args) {
		System.out.println(isOddValent(new int[] {9, 3, 4, 9, 1}));
		System.out.println(isOddValent(new int[] {3, 3, 3, 3} ));
		System.out.println(isOddValent(new int[] {8, 8, 8, 4, 4, 7, 2}));
		System.out.println(isOddValent(new int[] {1, 2, 3, 4, 5}));
		System.out.println(isOddValent(new int[] {2, 2, 2, 4, 4}));
	}

	public static int isOddValent(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		int odd = 0;
		int count = 1;
		for (int i = 0; i < len; i++) {
			int j = i + 1;
			if (a[i] % 2 == 1) {
				odd = 1;
			}
			while (j < len) {
				if (a[j] == a[i]) {
					count++;
				}
				if (a[j] % 2 == 1) {
					odd = 1;
				}
				if (odd == 1 && count > 1) {
					return 1;
				}
				j++;
			}
		}
		return 0;
	}
}
