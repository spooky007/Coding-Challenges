package MaharishiCodingChallenges;

public class IsAllPossibilities {

	public static void main(String[] args) {
		System.out.println(isAllPossibilities(new int[] { 1, 2, 0, 3 }));
		System.out.println(isAllPossibilities(new int[] { 3, 2, 1, 0 }));
		System.out.println(isAllPossibilities(new int[] { 1, 2, 4, 3 }));
		System.out.println(isAllPossibilities(new int[] { 0, 2, 3 }));
		System.out.println(isAllPossibilities(new int[] { 0 }));
		System.out.println(isAllPossibilities(new int[] {}));
	}

	public static int isAllPossibilities(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		int found = 0;
		for (int i = 0; i < len; i++) {
			found = 0;
			for (int j = 0; j < len; j++) {
				if (a[i] > len - 1 || a[j] > len - 1) {
					return 0;
				}
				if (a[j] == i) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				return 0;
			}
		}
		return 1;
	}
}
