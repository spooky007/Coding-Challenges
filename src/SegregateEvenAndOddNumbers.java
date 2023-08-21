import java.util.Arrays;

public class SegregateEvenAndOddNumbers {

	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 3, 2, 6, 7, 11 };
		int[] numbers1 = {};
		System.out.print(Arrays.toString(segregate1(numbers1)));
//		segregate2(numbers1);
		segragate3(numbers, numbers.length);
	}

	public static int[] segregate1(int[] inputArray) {
		int len = inputArray.length;
		int[] odd = new int[len];
		int[] even = new int[len];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < len) {
			if (inputArray[i] % 2 == 0) {
				even[j++] = inputArray[i];
			}
			if (inputArray[i] % 2 != 0) {
				odd[k++] = inputArray[i];
			}
			i++;
		}
		i = 0;
		int l = 0;
		int m = 0;
		while (i < len) {
			while (l < j) {
				inputArray[i] = even[l];
				l++;
				i++;
			}
			while (m < k) {
				inputArray[i] = odd[m];
				m++;
				i++;
			}
		}
		return inputArray;
	}

	public static void segregate2(int[] inputArray) {
		int len = inputArray.length;
		int[] arr = new int[len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			if (inputArray[i] % 2 == 0) {
				arr[index++] = inputArray[i];
			}
		}
		for (int i = 0; i < len; i++) {
			if (inputArray[i] % 2 != 0) {
				arr[index++] = inputArray[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void segragate3(int arr[], int n) {

		int i = -1, j = 0;
		while (j != n) {
			if (arr[j] % 2 == 0) {
				i++;

				// Swapping even and
				// odd numbers
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}

		// Printing segregated array
		for (int k = 0; k < n; k++)
			System.out.print(arr[k] + " ");
	}
}
