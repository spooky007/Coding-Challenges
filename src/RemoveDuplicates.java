import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] numbers = {1, 3, 4, 3, 5, 6, 7, 8, 2, 8, 4, 5, 2, 7, 2, 2, 2, 2, 2, 10};
		System.out.println(Arrays.toString(removeDuplicates2(numbers)));
//		System.out.println(Arrays.toString(shiftLeft(numbers, 2)));
//		System.out.println(Arrays.toString(dropElement(numbers, 5)));
//		System.out.println(Arrays.toString(removeDuplicates(numbers)));
	}

	public static int[] removeDuplicates(int[] inputArray) {
		int len = inputArray.length;
		int[] tempArray = new int[len];
//		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if(inputArray[i] == inputArray[j]) {
					shiftLeft(inputArray, j);
					// count++;
				}
			}
		}
		int newLength = len; // count;
		int[] newArray = new int[newLength];
		for (int i = 0; i < newLength; i++ ) {
			newArray[i] = inputArray[i];
		}
		
		return newArray;
	}
	
	public static int[] shiftLeft(int[] inputArray, int index) {
		int len = inputArray.length;
		for (int i = index; i < len - 1; i++) {
			inputArray[i] = inputArray[i + 1];
		}
		return inputArray;
	}
	
	public static int[] removeDuplicates1(int[] inputArray) {
		int len = inputArray.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if(inputArray[i] == inputArray[j]) {
					inputArray[j] = -1;
					count++;
				}
			}
		}
		int newLength = len - count;
		int[] newArray = new int[newLength];
		int j = 0;
		for (int i = 0; i < newLength; i++) {
			if(inputArray[i] != -1) {
				newArray[j++] = inputArray[i];
			}
		}
		return newArray;
		
//		int newLength = len - count; // count;
//		int[] newArray = new int[newLength];
//		int counter = 0;
//		for (int i = 0; i < newLength; i++ ) {
//			for (int j = counter; j < newLength; j++) {
//				if (inputArray[j] == -1) {
//					counter++;
//					continue;
//				} else {
//					newArray[i] = inputArray[j];
//				}
//			}
//		}
//		
//		return newArray;
	}
	
	// Utility function
	public static int[] removeDuplicates2(int[] inputArray) {
		int len = inputArray.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if(inputArray[i] == inputArray[j]) {
					inputArray[j] = -1;
				}
			}
		}
		int count = 0;
		for (int a = 0; a < len; a++) {
			if (inputArray[a] == -1) {
				count++;
			}
		}
		int newLength = len - count;
		int[] newArray = new int[newLength];
		int j = 0;
		for (int i = 0; i < len; i++) {
			if(inputArray[i] != -1) {
				newArray[j] = inputArray[i];
				j++;
			}
		}
		return newArray;
	}
}