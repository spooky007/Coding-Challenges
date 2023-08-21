package MaharishiCodingChallenges;

public class IsSequentiallyBounded {

	public static void main(String[] args) {
		int[] numbers1 = { 0, 1 };
		int[] numbers2 = { -1, 2 };
		int[] numbers3 = {};
		int[] numbers4 = { 5, 5, 5, 5 };
		int[] numbers5 = { 5, 5, 2, 5 };
		int[] numbers6 = { -5, -4, -3, -2 };
		System.out.println(isSequentiallyBounded(numbers6));
	}

	public static int isSequentiallyBounded(int[] a) {
		int len = a.length;
		int isSequentiallyBounded = 1;
		if (len == 0) {
			return isSequentiallyBounded = 1;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] >= a[i + 1]) {
				continue;
			} else if (a[i] < a[i + 1] || a[i] < 0) {
				return isSequentiallyBounded = 0;
			}
		}
		int count = 0;
		int temp = a[0];
		for (int i = 1; i < len; i++) {
			if (a[i] == temp && count < temp) {
				count++;
			} else {
				a[i] = temp;
			}
		}
		return isSequentiallyBounded;
	}
}
