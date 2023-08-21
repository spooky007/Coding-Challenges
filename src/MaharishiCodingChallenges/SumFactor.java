package MaharishiCodingChallenges;

public class SumFactor {

	public static void main(String[] args) {
		int[] numbers1 = { 1, -1, 1, -1, 1, -1, 1 };
		int[] numbers2 = {3, 0, 2, -5, 0};
		int[] numbers3 = {9, -3, -3, -1, -1};
		int[] numbers4 = {1};
		int[] numbers5 ={0, 0, 0};
		System.out.println(sumFactor(numbers5));
	}

	public static int sumFactor(int[] a) {
		int len = a.length;
		int sum = 0;
		int count = 0; // this measures the occurence of array sum
		for (int i = 0; i < len; i++) {
			sum += a[i];
		}
		for (int i = 0; i < len; i++) {
			if (a[i] == sum) {
				count++;
			}
		}
		return count;
	}
}
