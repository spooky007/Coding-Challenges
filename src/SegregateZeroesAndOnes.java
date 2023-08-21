import java.util.Arrays;

public class SegregateZeroesAndOnes {

	// Drive function
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1 };
		System.out.println(Arrays.toString(separateZeroesAndOnes2(numbers)));
	}

	public static int[] separateZeroesAndOnes1(int[] inputArray) {
		int len = inputArray.length;
		int[] ans = new int[len];
		int zeroes = 0;
		for (int i = 0; i < len; i++) {
			if (inputArray[i] == 0) {
				zeroes++;
			}
		}
		int i = 0;
		for (i = 0; i < zeroes; i++) {
			ans[i] = 0;
		}
		for (i = zeroes; i < len; i++) {
			ans[i] = 1;
		}
		return ans;
	}

	public static int[] separateZeroesAndOnes2(int[] inputArray) {
		int len = inputArray.length;
		int leftPointer = 0;
		int rightPointer = len - 1;
		while (leftPointer < rightPointer) {
			while (inputArray[rightPointer] == 1) {
				rightPointer--;
			}
			while (inputArray[leftPointer] == 0) {
				leftPointer++;
			}
			if (inputArray[rightPointer] != 1 & inputArray[leftPointer] != 0) {
				swap(inputArray, rightPointer, leftPointer);
				rightPointer--;
				leftPointer++;
			}
		}
		return inputArray;
	}

	// Utility function
	public static void swap(int[] inputArray, int i, int j) {
		int temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
	}
}
