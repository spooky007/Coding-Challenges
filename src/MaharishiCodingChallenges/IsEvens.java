package MaharishiCodingChallenges;

public class IsEvens {

	public static void main(String[] args) {
		System.out.println(isEvens(2426 ));
		System.out.println(isEvens(3224 ));
		System.out.println(isEvens(2468 ));
		System.out.println(isEvens(2416 ));
	}
	
	public static int isEvens(int n) {
		while (n > 0) {
			int remainder = n % 10;
			if (remainder % 2 == 1) {
				return 0;
			}
			n /= 10;
		}
		return 1;
	}
}
