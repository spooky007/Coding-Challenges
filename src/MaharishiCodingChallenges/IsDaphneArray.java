package MaharishiCodingChallenges;

public class IsDaphneArray {

	public static void main(String[] args) {
		System.out.println(isDaphne(new int[] {2, 4, 2 }));
		System.out.println(isDaphne(new int[] { 1, 3, 17, -5 }));
		System.out.println(isDaphne(new int[] { 3, 2, 5 }));
	}

	public static int isDaphne(int[] a) {
		int len = a.length;
		if (a[0] % 2 == 0) {
			for (int i = 1; i < len; i++) {
				if (a[i] % 2 != 0) {
					return 0;
				}
			}
		} else {
			for (int i = 1; i < len; i++) {
				if (a[i] % 2 == 0) {
					return 0;
				}
			}
		}
		return 1;
	}

	static int isDaphne1(int[] a) {
		boolean evenFlag = false;
		boolean oddFlag = false;

		for (int anA : a) {
			if (anA % 2 == 0) {
				evenFlag = true;
			} else {
				oddFlag = true;
			}

			if (evenFlag && oddFlag)
				return 0;
		}
		return 1;
	}
}