package MaharishiCodingChallenges;

public class MinDistance {

	public static void main(String[] args) {
		System.out.println(minDistance(13013));
		System.out.println(minDistance(8));
	}
	
	public static int minDistance(int n) {
		if (n <= 0) {
			return 0;
		}
		int factor1 = 0;
		int factor2 = 1;
		int minFactorDiff = Integer.MAX_VALUE;
		for (int i = 2; i < n; i ++) {
			if (n % i == 0) {
				factor1 = factor2;
				factor2 = i;
				int diff = factor2 - factor1;
				if ( diff < minFactorDiff) {
					minFactorDiff = diff;
				}
			}
		}
		return minFactorDiff;
	}
}
