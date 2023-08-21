package MaharishiCodingChallenges;

public class IsBalanced {

	public static void main(String[] args) {
		System.out.println(isBalanced(new int[] { -2, 3, 2, -3 }));
		System.out.println(isBalanced(new int[] { -2, 2, 2, 2 }));
		System.out.println(isBalanced(new int[] { -5, 2, -2 }));
	}

	public static int isBalanced(int[] a) {
		int len = a.length;
		int balance = 0;
		for (int i = 0; i < len; i++) {
			int balanceFound = 0;
			balance = -a[i];
			int j = 0;
			while (j < len) {
				if (a[j] == balance) {
					balanceFound = 1;
				}
				j++;
			}
			if (balanceFound == 0) {
				return 0;
			}
		}
		return 1;
	}
}
