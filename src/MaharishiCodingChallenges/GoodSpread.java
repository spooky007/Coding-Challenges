package MaharishiCodingChallenges;

public class GoodSpread {

	public static void main(String[] args) {
		System.out.println(goodSpread(new int[] { 2, 1, 2, 5, 2, 1, 5, 9 }));
		System.out.println(goodSpread(new int[] { 3, 1, 3, 1, 3, 5, 5, 3 }));
	}

	public static int goodSpread(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int count = 0;
			for (int k = 0; k < len; k++) {
				if (a[i] == a[k]) {
					count++;
				}
			}
			if (count > 3) {
				return 0;
			}
		}
		return 1;
	}
}
