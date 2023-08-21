import java.util.Arrays;

public class PrintEvenOrOddIndexes {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
//		System.out.println(Arrays.toString(even(numbers)));
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(odd(numbers)));
		displayOddPosition(numbers);
	}

	public static int[] even(int[] inputArray) {
		int arraySize = inputArray.length;
		int newSize = arraySize / 2;
		int[] even = new int[newSize];
		int k = 0;
		for (int i = 0; i < arraySize; i++) {
			if ((i + 1) % 2 == 0) {
				even[k++] = inputArray[i];
			}
		}
		return even;
	}

	public static int[] odd(int[] inputArray) {
		int arraySize = inputArray.length;
		int newSize = arraySize / 2;
		int[] odd = new int[newSize];
		int k = 0;
		for (int i = 0; i < arraySize; i++) {
			if (i % 2 != 0) {
				odd[k++] = inputArray[i];
			}
		}
		return odd;
	}

	public static void displayEvenPosition(int[] arr) {
		// iterating through the array using for loop
		for (int i = 1; i < arr.length; i = i + 2) {

			// print element to the console
			System.out.println(arr[i]);
		}

	}

	public static void displayOddPosition(int[] arr) {
		// iterating through the array using for loop
		for (int i = 0; i < arr.length; i = i + 2) {

			// print element to the console
			System.out.println(arr[i]);
		}

	}

	public static void printOddPositionElements(int[] inputArray) {
		System.out.println("Array elements at odd position..");
		// pointer 
		int flag = 1;
		for (int i = 0; i < inputArray.length; i++) {
			if (flag == 1) {
				System.out.print(inputArray[i] + " ");
				flag = 0;
			} else {
				flag = 1;
			}
		}
	}
}
