import java.util.Arrays;

public class MergeArrays {

	public static int[] mergeArrays(int[] inputArray1, int[] inputArray2) {
		int len1 = inputArray1.length;
		int len2 = inputArray2.length;
		int[] mergedArray = new int[len1 + len2];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < len1 && j < len2) {
			if (inputArray1[i] < inputArray2[j]) {
				mergedArray[k++] = inputArray1[i++];
			} else {
				mergedArray[k++] = inputArray2[j++];
			}
		}
		// Store remaining elements of first array
		while(i < len1) {
			mergedArray[k++] = inputArray1[i++];
		}
		// Store remaining elements of second array
		while(j < len2) {
			mergedArray[k++] = inputArray2[j++];
		}

		return mergedArray;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 7, 9, 11, 13};
		int[] numbers2 = {2, 4, 6, 8, 10, 12, 14};
		System.out.println(Arrays.toString(mergeArrays(numbers, numbers2)));
		
	}
}