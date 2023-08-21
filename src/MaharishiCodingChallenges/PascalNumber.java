package MaharishiCodingChallenges;

public class PascalNumber {

	public static void main(String[] args) {
		System.out.println(isPascal(6));
		System.out.println(isPascal(15));
		System.out.println(isPascal(7));
		System.out.println(isPascal(0));
		System.out.println(isPascal(1));
	}
	
	public static int isPascal(int n) {
		if (n == 0) {
			return 0;
		}
		int j = 1;
		int sum = 0;
		
		while (sum < n) {
			sum += j;
			j++;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
