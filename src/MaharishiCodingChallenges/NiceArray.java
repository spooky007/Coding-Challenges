package MaharishiCodingChallenges;

public class NiceArray {

	public static void main(String[] args) {
		System.out.println(isNice(new int[] { 2, 2, 3, 3, 3 }));
		System.out.println(isNice(new int[] { 1, 1, 1, 2, 1, 1 }));
		System.out.println(isNice(new int[] { 0, -1, 1 }));
		System.out.println();
		System.out.println(isNice(new int[] { 3, 4, 5, 7 }));
	}

	public static int isNice(int[] a) {
		int len = a.length;
		int found = 0;
		for (int i = 0; i < len; i++) {
			int plus1 = a[i] + 1;
			int minus1 = a[i] - 1;
			found = 0;
			for (int k = 0; k < len; k++) {
				if (a[k] == plus1 || a[k] == minus1) {
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
