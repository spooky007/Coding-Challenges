package MaharishiCodingChallenges;

public class DaphneArray {

	public static void main(String[] args) {
		System.out.println(isDaphne(new int[] { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 }));
		System.out.println(isDaphne(new int[] { 2, 4, 6, 8, 6 }));
		System.out.println(isDaphne(new int[] { 2, 8, 7, 10, -4, 6 }));
	}

	public static int isDaphne(int[] a) {
		int len = a.length;
		int leftEven = 0;
		int rightEven = 0;
		int leftPointer = 0;
		int rightPointer = len - 1;
		int oddCount = 0;
		boolean leftFlag = false;
		boolean rightFlag = false;
		while (leftPointer < rightPointer) {
			if (a[leftPointer] % 2 == 0 && !leftFlag) {
				leftEven++;
			}
			if (a[rightPointer] % 2 == 0 && !rightFlag) {
				rightEven++;
			}
			if (a[rightPointer] % 2 == 1) {
				oddCount++;
				rightFlag = true;
			}
			if (a[leftPointer] % 2 == 1) {
				oddCount++;
				leftFlag = true;
			}
			leftPointer++;
			rightPointer--;
		}
		if (oddCount == 0 || leftEven != rightEven) {
			return 0;
		}
		return 1;
	}
}
