package MaharishiCodingChallenges;

public class IsCentered {

	public static void main(String[] args) {
		System.out.println(isCentered(new int[] { 5, 3, 3, 4, 5 }));
		System.out.println(isCentered(new int[] { 3, 2, 1, 4, 5 }));
		System.out.println(isCentered(new int[] { 3, 2, 1, 4, 1 }));
		System.out.println(isCentered(new int[] { 3, 2, 1, 1, 4, 6 }));
		System.out.println(isCentered(new int[] {}));
		System.out.println(isCentered(new int[] {1}));
	}

	public static int isCentered(int[] a) {
		int len = a.length;
		if (len % 2 == 0 || len == 0) {
			return 0;
		}
		if (len == 1) {
			return 1;
		}
		int middleIndex = len / 2;
		int middleElement = a[middleIndex];
		for (int i = 0; i < len; i++) {
			if (i == middleIndex) {
				continue;
			}
			if (a[i] <= middleElement) {
				return 0;
			}
		}
		return 1;
	}
}
