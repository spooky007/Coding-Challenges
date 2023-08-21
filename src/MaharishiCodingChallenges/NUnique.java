package MaharishiCodingChallenges;

public class NUnique {

	public static void main(String[] args) {
		int[] digits1 = { 7, 3, 3, 2, 4 };
		int[] digits2 = { 1 };
		int n1 = 6, n2 = 10, n3 = 11, n4 = 8, n5 = 4, n6 = 34; // n6 can be anything
		
		System.out.println(isUnique(digits2, n6));
	}

	public static int isUnique(int[] a, int n) {
		int len = a.length;
		if(len < 2) {
			return 0;
		}
		int isUnique = 0;
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] + a[j] == n) {
					count++;
				}
			}
			if (count > 1) {
				break;
			}
		}
		if (count == 1) {
			isUnique = 1;
		}
		return isUnique;
	}
}
