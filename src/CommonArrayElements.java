import java.util.Arrays;

public class CommonArrayElements {
	
	public static void main(String[] args) {
		int[] numbers1 = {2, 4, 5, 9, 10 };
		int[] numbers2 = {2, 8, 9, 10, 11};
		System.out.println(Arrays.toString(commonElements(numbers1, numbers2)));
	}
	
	public static int[] commonElements(int[] inputArray1, int[] inputArray2) {
		int counter = 0;
		int len1 = inputArray1.length;
		int len2 = inputArray2.length;
		int len3 = Math.min(len1, len2);
		int[] numbers = new int[len3];
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if (inputArray1[i] == inputArray2[j]) {
					numbers[counter] = inputArray1[i];
					counter++;
				}
			}
		}
		int[] numbers4 = new int[counter];
		for (int i = 0; i < counter; i++) {
			numbers4[i] = numbers[i];
		}
		return numbers4;
	}
}