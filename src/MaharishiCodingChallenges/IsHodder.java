package MaharishiCodingChallenges;

public class IsHodder {

	public static void main(String[] args) {
		System.out.println(isHodder(123));
	}
	
	public static int isHodder(int n) {
		int j = 0;
		int hodder = 0;
		while ( hodder < n) {
			hodder = (int) Math.pow(2, j) - 1;
			if (isPrime(hodder) == 1 && hodder == n) {
				return 1;
			}
			j++;
		}
		return 0;
	}
	
	public static int isPrime(int n) {
		int isPrime = 1;
		int count = 0;
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				count++;
			}
			if (count > 0) {
				return isPrime = 0;
			}
			i++;
		}
		return isPrime;
	}
}
