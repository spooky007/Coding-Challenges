package MaharishiCodingChallenges;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(3114));
		System.out.println(sumDigits(-6543));
		System.out.println(sumDigits(0));
	}
	
	public static int sumDigits(int n) {
		int sum = 0;
		n = n > 0 ? n : -n;
		while (n != 0) {
			int remainder = n % 10;
			sum += remainder;
			n /= 10;
		}
		return sum;
	}
}
