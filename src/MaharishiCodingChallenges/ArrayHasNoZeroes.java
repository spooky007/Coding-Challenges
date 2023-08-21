package MaharishiCodingChallenges;

public class ArrayHasNoZeroes {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3 };
		int[] numbers2 = { 1, 0, 4, 0 };
		int[] numbers3 = { 1, 2, 3, 0 };
		int[] numbers4 = { 0, 0, 0, 0 };
		int[] numbers5 = {};
		
		System.out.println(arrayHasNoZeroes(numbers5));
	}

	public static int arrayHasNoZeroes(int[] a) {
		int len = a.length;
		int i = 0;
		int arrayHasNoZeroes = 1;
		while (i < len) {
			if (a[i] == 0) {
				return 0;
			}
			i++;
		}
		return arrayHasNoZeroes;
	}
}
