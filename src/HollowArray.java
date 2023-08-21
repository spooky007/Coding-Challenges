
public class HollowArray {

	public static void main(String[] args) {
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4 }));
		System.out.println(isHollow(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 }));
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 3, 4 }));
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 }));
		System.out.println(isHollow(new int[] { 3, 8, 3, 0, 0, 0, 3, 3 }));
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 }));
		System.out.println(isHollow(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 }));
		System.out.println(isHollow(new int[] { 0, 0, 0 }));
	}

	public static int isHollow(int[] a) {
		int len = a.length;
		int leftNonZeroes = 0;
		int rightNonZeroes = 0;
		int leftPointer = 0;
		int rightPointer = len - 1;
		int zeroes = 0;
		boolean zeroStart = false;
		boolean zeroEnd = false;
		while (leftPointer <= rightPointer) {
			if (a[leftPointer] != 0) {
				if (zeroStart == false) {
					leftNonZeroes++;
				} else {
					return 0;
				}
			}
			if (a[rightPointer] != 0) {
				if (zeroEnd == false) {
					rightNonZeroes++;
				} else {
					return 0;
				}
			}
			if (leftNonZeroes != rightNonZeroes) {
				return 0;
			}
			if (a[leftPointer] == 0) {
				zeroStart = true;
				zeroes++;
			}
			if (a[rightPointer] == 0 && rightPointer != leftPointer) {
				zeroEnd = true;
				zeroes++;
			}
			leftPointer++;
			rightPointer--;
		}
		if (zeroes < 3) {
			return 0;
		}
		return 1;
	}
}
