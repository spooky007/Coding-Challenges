package MaharishiCodingChallenges;

public class IsLegalNumber {

	public static void main(String[] args) {
//		System.out.println(isLegalNumber(new int[] { 3, 2, 1 }, 4));
//		System.out.println(isLegalNumber(new int[] { 3, 7, 1 }, 6));
//		System.out.println(power(3, 3));
//		System.out.println(convertToBase10(new int[] {1, 0, 1, 1}, 2));
//		System.out.println(convertToBase10(new int[] { 1, 1, 2 }, 3));
//		System.out.println(convertToBase10(new int[] { 3, 2, 5 }, 8));
		System.out.println(convertToBase10(new int[] { 3, 7, 1 }, 6));
	}

	public static int isLegalNumber(int[] a, int base) {
		int isLegalNumber = 1;
		for (int i : a) {
			if (i >= base) {
				return 0;
			}
		}

		return isLegalNumber;
	}

	public static int convertToBase10(int[] a, int n) {
		int len = a.length;
		int baseTenNumber = 0;
		int x = 0;
		if (isLegalNumber(a, n) == 1) {
			for (int i = len - 1; i >= 0; i--) {
				baseTenNumber += a[i] * power(n, x);
				x++;
			}
		} else {
			return 0;
		}
		return baseTenNumber;
	}

	private static int power(int n, int superscript) {
		if (superscript == 0) {
			return 1;
		}
		int sum = 1;
		int index = 0;
		while (index < superscript) {
			sum *= n;
			index++;

		}
		return sum;
	}
}
