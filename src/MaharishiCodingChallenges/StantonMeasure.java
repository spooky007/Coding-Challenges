package MaharishiCodingChallenges;

public class StantonMeasure {

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 3, 2, 1, 2, 3, 2 };
		int[] numbers1 = { 1 };
		int[] numbers2 = { 0 };
		int[] numbers3 = { 3, 1, 1, 4 };
		System.out.println(stantonMeasure(numbers3));
	}

	public static int stantonMeasure(int[] inputArray) {
		int len = inputArray.length;
		int count = 0;
		int no = 0;
		for (int i = 0; i < len; i++) {
			if (inputArray[i] == 1) {
				count++;
			}
		}
		for (int i = 0; i < len; i++) {
			if (inputArray[i] == count) {
				no++;
			}
		}
		return no;
	}
}
