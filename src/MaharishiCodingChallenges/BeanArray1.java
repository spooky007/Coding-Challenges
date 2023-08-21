package MaharishiCodingChallenges;

public class BeanArray1 {

	public static void main(String[] args) {
		System.out.println(isBean(new int[] { 4, 9, 8 }));
		System.out.println(isBean(new int[] { 2, 2, 5, 11, 23 }));
		System.out.println(isBean(new int[] { 7, 7, 3, 6 }));
		System.out.println(isBean(new int[] { 0 }));
		System.out.println(isBean(new int[]  {3, 8, 4}));
	}

	private static int isBean(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int bean1 = 2 * a[i];
			int bean2 = (2 * a[i]) + 1;
			int bean3 = a[i] / 2;
			int found = 0;
			for (int k = 0; k < len; k++) {
				if (a[k] == bean1 || a[k] == bean2 || a[k] == bean3) {
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
