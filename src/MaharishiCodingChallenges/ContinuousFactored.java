package MaharishiCodingChallenges;

public class ContinuousFactored {

	public static void main(String[] args) {
		System.out.println(isContinuousFactored(6));
		System.out.println(isContinuousFactored(60));
		System.out.println(isContinuousFactored(120));
		System.out.println(isContinuousFactored(90));
		System.out.println(isContinuousFactored(18));
		System.out.println();
		System.out.println(isContinuousFactored(99));
		System.out.println(isContinuousFactored(121));
		System.out.println(isContinuousFactored(2));
		System.out.println(isContinuousFactored(13));

	}

	public static int isContinuousFactored(int n) {
		int result = 1;
		int temp = 0;
		int start = 1;
		for (int i = 2; i < n; i++) {
			if (isFactor(n, i) == 1) {
				if (i - temp == 1 && temp != 0) {
					temp = i;
					result *= i;
				} else {
					temp = i;
					start = i;
					result = 1;
					result *= i;
				}
			}
			if (result > n && isFactor(n, i + 1) == 1) {
				result = result / start;
				start = start + 1; // this moves the starting point to the next prime element
			} 
			if (result == n) {
				return 1;
			}
		}
		return 0;

	}

	public static int isFactor(int n, int factor) {
		if (n % factor == 0) {
			return 1;
		} else {
			return 0;
		}
	}
    /**
     * the following code fails the isContinuousFactored(18) test
     */
//	public static int isContinuousFactored1(int n) {
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0 && n % (i + 1) == 0)
//				return 1;
//		}
//		return 0;
//	}
}
