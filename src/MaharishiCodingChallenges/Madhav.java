package MaharishiCodingChallenges;

public class Madhav {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 5, 6 };
		int[] numbers1 = { 2, 1, 1 };
		int[] numbers2 = { 2, 1, 1, 4, -1, -1 };
		int[] numbers3 = { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
		int[] numbers4 = { 6, -3, -3, 8, -5, -4 };
		int[] numbers5 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 };
		int[] numbers6 = { 3, 1, 2, 3, 0};
		int[] numbers7 = { 18, 9, 10, 6, 6, 6};
		int[] numbers8 = {1, 2, 3, 4};
		System.out.println(isMadhavArray(numbers8));
	}

	/*
	 * this function determines if the array length is a MadhavLength
	 * 
	 * substituting n in n*(n+1)/2 gives us possible Madhav array lengths
	 * eg n = 1 gives length of 1 hence givenArray[0]
	 *    n = 2 gives length of 3 hence givenArray[1] + givenArray[2] = givenArray[0]
	 */
	public static int isMadhavArray(int[] inputArray) {
		int len = inputArray.length;
		int isMadhav = 1; // tells if array length is MadHav array length
		int n = 0;
		// checking if given array length is a MadHavArray
		while (n < len) {
			n++;
			int k = (n * (n + 1)) / 2;
			if (k > len) {
				return isMadhav = 0;
			}
			if (k == len) {
				isMadhav = 1;
				break;
			} else {
				isMadhav = 0;
			}
		}
		return isMadhav(n, inputArray);
	}

	/*
	 * this function determines if the subarrays are equal
	 * that is a[0] = a[1] + a[2] = a[3] + a[4] + a[5} depending
	 * on the length of the given array
	 */
	public static int isMadhav(int n, int[] inputArray) {
		// if array has only one element return the true
		if (n == 1) {
			return 1;
		}
		int previousSum = 0;
		int sum = 0;
		int position = 1; // tracks position of index while traversing inputArray
		int arrayIndex = 0;
		previousSum = inputArray[arrayIndex]; // first subarray which is first element
		// this for loop traverses different subarray addition
		for (int i = 2; i < n + 1; i++) {
			int tempLen = position + i;  // indicates end index of inputArray when subarray is added
			for (int j = position; j < tempLen; j++) {
				sum += inputArray[j];
				position++;
			}
			if(sum == previousSum) {
				previousSum = sum; // replace previous Sum with present sum if they are equal
				sum = 0;  // this resets sum to zero to create the space for next subarray sum
			} else {
				return 0;
			}
		}
		return 1;
	}
}
