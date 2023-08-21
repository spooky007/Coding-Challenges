package MaharishiCodingChallenges;

public class LargestAdjacentSum {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4 };
		int[] numbers2 = { 18, -12, 9, -10 };
		int[] numbers3 = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] numbers4 = { 1, 1, 1, 1, 1, 2, 1, 1, 1 };
		
		System.out.println(largestAdjacentSum(numbers4));
	}

	public static int largestAdjacentSum(int[] a) {
		int len = a.length;
		int largestAdjacentSum = 0;
		if (len < 2) {
			return 0;
		}
		for (int i = 0; i < len - 1; i++) {
			if (a[i] + a[i + 1] > largestAdjacentSum) {
				largestAdjacentSum = a[i] + a[i + 1];
			}
		}
		return largestAdjacentSum;
	}
}
