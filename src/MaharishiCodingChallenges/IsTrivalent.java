package MaharishiCodingChallenges;

public class IsTrivalent {

	public static void main(String[] args) {
		int[] numbers1 = { 22, 19, 10, 10, 19, 22, 22, 10 };
		int[] numbers2 = { 1, 2, 2, 2, 2, 2, 2 };
		int[] numbers3 = { -1, 0, 1, 0, 0, 0 };
		int[] numbers4 = {};
		int[] numbers5 = { 2147483647, -1, -1, -2147483648 };

		System.out.println(isTrivalent1(numbers3));
	}

	public static int isTrivalent(int[] a) {
		int len = a.length;
		if (len < 3) {
			return 0;
		}
		int isTrivalent = 1;
		int i = 1, first = a[0], second = -1, third = -1;
		while (i < len) {
			if (a[i] != first && second == -1) {
				second = a[i];
			}
			if (a[i] != second && a[i] != first && third == -1) {
				third = a[i];
			}
			i++;
		}
		int[] trivalents = { first, second, third };
		for (int k = 0; k < trivalents.length; k++) {
			if (trivalents[k] == -1) {
				return 0;
			}
		}
		for (i = 0; i < len; i++) {
			int j = 0;
			while (j < trivalents.length) {
				if (a[i] != trivalents[j]) {
					isTrivalent = 0;
				} else {
					isTrivalent = 1;
					break;
				}
				j++;
			}
			if (isTrivalent == 0) {
				return 0;
			}
		}
		return isTrivalent;
	}

	public static int isTrivalent1(int[] a) {
		if (a.length < 3) {
			return 0;
		}
		int i, j, pos = 0, zero = 0, flag;
		int[] nums = new int[3];

		for (i = 0; i < a.length; i++) {
			flag = 1;
			for (j = 0; j < 3; j++) {
				if (a[i] == nums[j] && a[i] != 0) {
					flag = 0;
				}
			}
			if (a[i] == 0 && zero == 0) {
				nums[pos++] = a[i];
				zero = 1;
			} else if (a[i] != 0 && flag == 1) {
				if (pos < 3) {
					nums[pos++] = a[i];
				}
				else if (pos == 3) {
					return 0;
				}
			}
		}
		if (pos < 3) {
			return 0;
		}
		return 1;
	}
}
