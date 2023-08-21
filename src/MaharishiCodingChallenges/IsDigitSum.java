package MaharishiCodingChallenges;

public class IsDigitSum {

	public static void main(String[] args) {
		System.out.println(isDigitSum(32121, 10));
		System.out.println(isDigitSum(32121, 9));
		System.out.println(isDigitSum(13, 6));
		System.out.println(isDigitSum(13, 6));
		System.out.println(isDigitSum(3, 3));
		System.out.println(isDigitSum(-543, 3));
	}
	
	public static int isDigitSum(int n, int m) {
		if (n < 0 || m < 0) {
			return -1;
		}
		int sum = 0;
		int remainder = 0;
		while (n  > 0) {
			remainder = n % 10;
			sum += remainder; 
			n /= 10;
		}
		if (sum < m) {
			return 1;
		} else {
			return 0;
		}
	}
}
