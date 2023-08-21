package MaharishiCodingChallenges;

public class IsLayered {

	public static void main(String[] args) {
		System.out.println(isLayered(new int[] {1, 1, 2, 2, 2, 3, 3}));
		System.out.println(isLayered(new int[] {3, 3, 3, 3, 3, 3, 3}));
		System.out.println(isLayered(new int[] {1, 2, 2, 2, 3, 3}));
		System.out.println(isLayered(new int[] {2, 2, 2, 3, 3, 1, 1}));
		System.out.println(isLayered(new int[] {2}));
		System.out.println(isLayered(new int[] {}));
	}

	private static int isLayered(int[] a) {
		int len = a.length;
		if (len == 0 || len == 1) {
			return 0;
		}
		int count = 1;
		int temp = a[0];
		for (int i = 1; i < len; i++) {
			if (a[i] < a[i -1]) {
				return 0;
			}
			if (a[i] == temp) {
				count++;
			} else {
				if (count < 2) {
					return 0;
				} else {
					temp = a[i];
					count = 1;
				}
			}
		}
		if (count < 2) {
			return 0;
		}
		return 1;
	}
}
