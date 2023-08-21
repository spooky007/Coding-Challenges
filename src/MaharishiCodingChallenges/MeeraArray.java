package MaharishiCodingChallenges;

public class MeeraArray {

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] { 3, 5, -2 }));
		System.out.println(isMeera(new int[] { 8, 3, 4 }));
	}

	public static int isMeera(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int k = 0;
			while (k < len) {
				if (a[k] == 2 * a[i]) {
					return 0;
				}
				k++;
			}
		}
		return 1;
	}
}
