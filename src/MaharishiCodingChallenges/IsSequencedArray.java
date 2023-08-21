package MaharishiCodingChallenges;

public class IsSequencedArray {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4, 5 }; // m =1 n =5
		int[] numbers2 = { 1, 3, 4, 2, 5 }; // m =1 n =5
		int[] numbers3 = { -5, -5, -4, -4, -4, -3, -3, -2, -2, -2 }; // m =-5 n =-2
		int[] numbers4 = { 0, 1, 2, 3, 4, 5 };  // m =1 n =5
		int[] numbers5 = { 1, 2, 3, 4 };  // m =1 n =5
		int[] numbers6 = { 1, 2, 5 };   // m =1 n =5
		int[] numbers7 = { 5, 4, 3, 2, 1 }; // m =1 n =5

		System.out.println(isSequencedArray(numbers1, 1, 5));
	}

	public static int isSequencedArray(int[] a, int m, int n) {
		int isSequencedArray = 1;
		int len = a.length;
		int count = m;
		if (a[0] != m) {
			return 0;
		}
		for (int i = 1; i < len; i++) {
			if (a[i] ==  a[i - 1] + 1) {
				count++;
			} else if (a[i] == a[i - 1]) {
				continue;
			} else {
				return isSequencedArray = 0;
			}
			
		}
		if (count != n) {
			isSequencedArray = 0;
		}
		return isSequencedArray;
	}
}
