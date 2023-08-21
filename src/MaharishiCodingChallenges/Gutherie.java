package MaharishiCodingChallenges;

public class Gutherie {

	public static void main(String[] args) {
		System.out.println(isGutherie(11));
		System.out.println(isGutherie(22));
		System.out.println(isGutherie(8));
	}

	private static int isGutherie(int n) {
		int result = 1;
		for (int i = 1; result < n; i++) {
			result += i;
		}
		if (result == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
