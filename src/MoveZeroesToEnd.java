import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 0, 0, 0, 3, 6};
		moveZeroesToEnd1(inputArray);
		System.out.println(Arrays.toString(inputArray));

	}

	public static void moveZeroesToEnd(int[] inputArray) {
		int len = inputArray.length;
		int rightPointer = len - 1;
		int leftPointer = 0;
		while (leftPointer < rightPointer) {
			while (inputArray[rightPointer] == 0 & rightPointer > leftPointer) {
					rightPointer--;
			}
			while (inputArray[leftPointer] != 0 & leftPointer < rightPointer) {
					leftPointer++;
			}
			insertAndShift(inputArray, leftPointer, rightPointer);
		}
	}
	
	// optimized version of the function
	public static void moveZeroesToEnd1(int[] inputArray) {
		int len = inputArray.length;
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (inputArray[i] != 0) {
				swap(inputArray, i, j);
				j++;
			}
		}
	}

	private static void insertAndShift(int[] inputArray, int i, int j) {
		int temp = inputArray[i];
		while (i < j) {
			inputArray[i] = inputArray[i + 1];
			i++;
		}
		inputArray[j] = temp;
	}

	// utility function to swap two values in an array
	public static void swap(int[] inputArray, int i, int j) {
		int temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
	}
	
}
