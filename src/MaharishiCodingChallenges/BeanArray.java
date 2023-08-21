package MaharishiCodingChallenges;

public class BeanArray {

	public static void main(String[] args) {
		System.out.println(isBean(new int[] { 1, 2, 3, 9, 6, 13 }));
		System.out.println(isBean(new int[] { 3, 4, 6, 7, 13, 15 }));
		System.out.println(isBean(new int[] { 1, 2, 3, 4, 10, 11, 12 }));
		System.out.println(isBean(new int[] { 3, 6, 9, 5, 7, 13, 6, 17 }));
		System.out.println();
		System.out.println(isBean(new int[] { 9, 6, 18 }));
		System.out.println(isBean(new int[] { 4, 7, 16 }));
	}

	public static int isBean(int[] a) {
		int len = a.length;
		int count9 = 0;
		int count13 = 0;
		int count7 = 0;
		int count16 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				count9++;
			}
			if (a[i] == 13) {
				count13++;
			} else if (a[i] == 7) {
				count7++;
				if (count16 > 0) {
					return 0;
				}
			} else if (a[i] == 16) {
				count16++;
				if (count7 > 0) {
					return 0;
				}
			}
		}
		if (count9 > 0 && count13 == 0) {
			return 0;
		}
		return 1;
	}
}
