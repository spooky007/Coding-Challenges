package MaharishiCodingChallenges;

public class IsFilterArray {

	public static void main(String[] args) {

		System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
		System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
		System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13} ));
		System.out.println(isFilter(new int[] {3, 6, 5, 5, 13, 6, 13}));
		System.out.println(isFilter(new int[] {9, 6, 18}));
		System.out.println(isFilter(new int[] {4, 7, 13} ));
		
		System.out.println(isFilter(new int[]{1, 2, 3, 6, 11, 7}));   // my test
	}

	public static int isFilter(int[] a) {
		int len = a.length;
		int count9 = 0;
		int count11 = 0;
		int count7 = 0;
		int count13 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				count9++;
			} else if (a[i] == 11) {
				count11++;
			} else if (a[i] == 7) {
				count7++;
			} else if (a[i] == 13) {
				count13++;
			}
		}
		if ((count9 > 0 && count11 > 0) || (count9 == 0 && count11 >= 0)) {
			if ((count7 > 0 && count13 == 0) || (count7 == 0 && count13 >= 0))
			return 1;
		}
		return 0;
	}
}
