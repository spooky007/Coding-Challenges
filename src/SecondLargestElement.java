
public class SecondLargestElement {

	public static void main(String[] args) {
		int[] numbers = { 5, 6, 8, 9, 10, 38, 86, 97, 108 };
		int[] numbers1 = { 12, 35, 1, 10, 34, 1 };
		System.out.println(secondLargestElement(numbers1));
	}

	public static int secondLargestElement(int[] inputArray) {
		int first, second, i;
		first = second = Integer.MIN_VALUE;
		i = 0;
		int arraySize = inputArray.length;

		while (i < arraySize) {
			if (inputArray[i] > first) {
				second = first;
				first = inputArray[i];
			}
			i++;
		}
		return second;
	}
}
