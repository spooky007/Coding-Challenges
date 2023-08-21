package MaharishiCodingChallenges;

public class ComputeDepth {

	public static void main(String[] args) {
		System.out.println(computeDepth(7));
	}

	public static int computeDepth(int n) {
		int[] numbers = new int[10];
		int remainder = 0;
		int multiple = 0;
		int i;
		for (i = 1; i < Integer.MAX_VALUE; i++) {
			multiple = n * i;
			while (multiple != 0) {
				remainder = multiple % 10;
				multiple /= 10;
				if (isInArray(numbers, remainder) == 0) {
					numbers[remainder] = remainder;
				}
				if (isComplete(numbers) == 1) {
					return i;
				}
			}
		}
		return i;

	}

	public static int isComplete(int[] a) {
		int isComplete = 1;
		int len = 10;
		for (int i = 0; i < len; i++) {
			if (a[i] != i) {
				return isComplete = 0;
			}
		}
		return isComplete;
	}

	public static int isInArray(int[] a, int n) {
		int size = a.length;
		int isInArray = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] == n) {
				return isInArray = 1;
			}
		}
		return isInArray;
	}
}
