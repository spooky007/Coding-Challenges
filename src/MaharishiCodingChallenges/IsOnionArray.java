package MaharishiCodingChallenges;

public class IsOnionArray {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 19, 4, 5 };
		int[] numbers2 = { 1, 2, 3, 4, 15 };
		int[] numbers3 = { 1, 3, 9, 8 };
		int[] numbers4 = { 2 };
		int[] numbers5 = {};
		int[] numbers6 = { -2, 5, 0, 5, 12 };
		System.out.println(isOnionArray(numbers1));
		System.out.println(isOnionArray(numbers2));
		System.out.println(isOnionArray(numbers3));
		System.out.println(isOnionArray(numbers4));
		System.out.println(isOnionArray(numbers5));
		System.out.println(isOnionArray(numbers6));
	}

	public static int isOnionArray(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 1;
		}
		int isOnionArray = 1;
		int leftPointer = 0;
		int rightPointer = len - 1;
		while (rightPointer != leftPointer) {
			if (a[leftPointer] + a[rightPointer] > 10) {
				return 0;
			}
			leftPointer++;
			rightPointer--;
		}
		return isOnionArray;
	}

}
