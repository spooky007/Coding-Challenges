package MaharishiCodingChallenges;

public class IsBalanced1 {

	public static void main(String[] args) {
		System.out.println(isBalanced(new int[] { 2, 3, 6, 7 }));   // 1
		System.out.println(isBalanced(new int[] { 6, 7, 2, 3, 12 }));     // 1
		System.out.println(isBalanced(new int[] { 7, 15, 2, 3 }));        // 0
		System.out.println(isBalanced(new int[] { 16, 6, 2, 3 }));       // 0
	}

	public static int isBalanced(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				if (a[i] % 2 != 0) {
					return 0;
				}
			} else {
				if (a[i] % 2 == 0) {
					return 0;
				}
			}
		}
		return 1;
	}
}
