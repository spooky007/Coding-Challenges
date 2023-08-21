package MaharishiCodingChallenges;

public class IsSquare {

	public static void main(String[] args) {
		System.out.println(isSquare(0));
	}

	public static int isSquare(int n) {
		int isSquare = 0;
		for (int i = 0; i <= n; i++) {
			if (i * i == n) {
				return 1;
			}
		}
		return isSquare;
	}
}
