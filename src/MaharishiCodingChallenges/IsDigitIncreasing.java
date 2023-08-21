package MaharishiCodingChallenges;

public class IsDigitIncreasing {

	public static void main(String[] args) {
		System.out.println(isDigitIncreasing(7));
		System.out.println(isDigitIncreasing(36));
		System.out.println(isDigitIncreasing(984));
		System.out.println(isDigitIncreasing(7404));
		System.out.println(isDigitIncreasing(65));
	}

	public static int isDigitIncreasing1(int n) {
		int isDigitIncreasing = 0;
		for (int i = 2; i < 9; i++) {
			int j = 1;
			int sum = i;
			int finalSum = i;
			if (finalSum == n) {
				return 1;
			}
			while (finalSum <= n) {
				sum += i * Math.pow(10, j++);
				finalSum += sum;
				if (finalSum == n) {
					return isDigitIncreasing = 1;
				}
			}
		}
		return isDigitIncreasing;
	}

	static int isDigitIncreasing(int n) {
		for (int i = 1; i <= 9; i++) {
			int sum = 0;
			int product = 0;
			while (sum < n) {
				product = (product * 10) + i;
				sum += product;
			}
			if (sum == n) {
				return 1;
			}
		}
		return 0;
	}
}
