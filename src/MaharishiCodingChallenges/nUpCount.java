package MaharishiCodingChallenges;

public class nUpCount {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 1, -6, 8, -3, -1, 2 };
		int[] numbers1 = { 6, 3, 1 };
		int[] numbers2 = { 1, 2, -1, 5, 3, 2, -3 };
		System.out.println(nUpCount(numbers, 20));

	}

	public static int nUpCount(int[] inputArray, int n) {
		int upCount = 0;
		int len = inputArray.length;
		int partialSum = 0;
		int flag = 1;
		for (int i = 0; i < len; i++) {
			partialSum += inputArray[i];
			if (partialSum <= n) {
				flag = 0;
			}
			if (partialSum > n && flag == 0) {
				upCount++;
				flag = 1;
			}
		}
		return upCount;
	}
}
