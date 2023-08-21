package MaharishiCodingChallenges;

public class TripleArray {

	public static void main(String[] args) {
		System.out.println(isTriple(new int[] { 3, 1, 2, 1, 3, 1, 3, 2, 2 }));
		System.out.println(isTriple(new int[] { 2, 5, 2, 5, 5, 2, 5 }));
		System.out.println(isTriple(new int[]{3, 1, 1, 1}));
		System.out.println(isTriple(new int[] {}));
	}

	public static int isTriple(int[] a) {
		int len = a.length;
		if (len % 3 != 0) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			int occurence = 0;
			for (int k = 0; k < len; k++) {
				if (a[k] == a[i]) {
					occurence++;
				}
			}
			if (occurence != 3) {
				return 0;
			}
		}
		return 1;
	}
}
