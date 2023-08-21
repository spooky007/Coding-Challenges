package MaharishiCodingChallenges;

public class IsComplete1 {

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7 }));
		System.out.println(isComplete(new int[] { 5, 7, 9, 13 }));
		System.out.println(isComplete(new int[] { 2, 2 }));
		System.out.println(isComplete(new int[] { 2, 6, 3, 4 }));
	}

	public static int isComplete(int[] a) {
		int len = a.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int evenCount = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				if (a[i] > max) {
					max = a[i];
				}
				if (a[i] < min) {
					min = a[i];
				}
				evenCount++;
			}
		}
		if (min == max || evenCount == 0) {
			return 0;
		}
		int k = min;
		for (int i = min; i <= max; i++) {
			int found = 0;
			for (int j = 0; j < len; j++) {
				if (a[j] == i) {
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
