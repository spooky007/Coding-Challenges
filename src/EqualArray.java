
public class EqualArray {

	public static void main(String[] args) {
		System.out.println(isEqual(new int[] { 1, 9, 12 }, new int[] { 12, 1, 9 }));
		System.out.println(isEqual(new int[] { 9, 1, 12, 1 }, new int[] { 1, 9, 12, 9, 12, 1, 9 }));
		System.out.println();
		System.out.println(isEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 1 }));
		System.out.println(isEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 6 }));
	}
	
	private static int isEqual(int[] a, int[] b) {
		int len1 = a.length;
		int len2 = b.length;
		for (int i = 0; i < len1; i++) {
			int found = 0;
			for (int k = 0; k < len2; k++) {
				if (a[i] == b[k]) {
					found = 1;
				}
			}
			if (found == 0) {
				return 0;
			}
		}
		return 1;
	}
}
