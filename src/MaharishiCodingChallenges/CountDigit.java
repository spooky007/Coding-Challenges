package MaharishiCodingChallenges;

public class CountDigit {

	public static void main(String[] args) {
		System.out.println(countDigit(32121, 1));
		System.out.println(countDigit(33331, 3));
		System.out.println(countDigit(33331, 6));
		System.out.println(countDigit(3, 3));
		System.out.println(countDigit(-543, 3));
	}

	public static int countDigit(int n, int digit) {
		if (n < 0 || digit < 0) {
			return -1;
		}
		int digitCount = 0;
		while (n > 0) {
			if (n % 10 == digit) {
				digitCount++;
			}
			n /= 10;
		}
		return digitCount;
	}
}
