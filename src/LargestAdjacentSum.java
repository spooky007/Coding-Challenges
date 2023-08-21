public class LargestAdjacentSum {
	
	public static void main(String[] args) {
		int[] numbers = {18, -12, 9, -10};
		int[] numbers2 = {1, 1, 1, 1, 1, 1, 2, 1, 1, 1};
		System.out.println(LargestAdjacentSum(numbers2));
	}
	
	public static int LargestAdjacentSum(int[] inputArray) {
		int length = inputArray.length;
		int sum = 0;
		for (int i = 0; i < length - 1; i++) {
			if (inputArray[i] + inputArray[i+1] > sum) {
				sum = inputArray[i] + inputArray[i+1];
			}
			
		}
		return sum;
	}
}