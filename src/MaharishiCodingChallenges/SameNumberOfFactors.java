package MaharishiCodingChallenges;

public class SameNumberOfFactors {

	public static void main(String[] args) {
		System.out.println(sameNumberOfFactors(-6, 21));
		System.out.println(sameNumberOfFactors(6, 21));
		System.out.println(sameNumberOfFactors(8, 12));
		System.out.println(sameNumberOfFactors(23, 97));
		System.out.println(sameNumberOfFactors(0, 1));
		System.out.println(sameNumberOfFactors(0, 0));
		
	}
	
	public static int sameNumberOfFactors(int n, int a) {
		if (n < 0 || a < 0) {
			return -1;
		}
		if (n == a) {
			return 1;
		}
		
		if(noOfFactors(n) == noOfFactors(a)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int noOfFactors(int n) {
		int count = 0;
		int i = 1;
		while (i <= n) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		return count;
	}
}
