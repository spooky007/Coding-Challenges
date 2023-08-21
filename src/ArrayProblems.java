public class ArrayProblems {
	
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 0, 0, 2, 0, 0, 4, 0, 8, 0, 0};
		System.out.println(zeroFilledSubarray(numbers));

	}

	public static int zeroFilledSubarray(int[] numbers) {
		// Initialize the count for the number of subarrays that have a sum of zero
		int count = 0;
		// Initialize the count for the number of consecutive zeros in a subarray
		int currentCount = 0;
		// Iterate through the array
		for (int i = 0; i < numbers.length; i++) {
			// If the current element is zero
			if (numbers[i] == 0) {
				// Increment the current count
				currentCount++;
				// Add the current count to the total count
				count += currentCount;
				// If the current element is not zero
			} else {
				// Reset the current count to zero
				currentCount = 0;
			}
		}
		// Return the total count
		return count;
	}
}