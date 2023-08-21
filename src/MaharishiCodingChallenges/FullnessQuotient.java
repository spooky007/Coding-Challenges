package MaharishiCodingChallenges;

public class FullnessQuotient {

	public static void main(String[] args) {
		System.out.println(fullnessQuotient(-4));
	}

	public static int fullnessQuotient(int n) {
		if (n < 1) {
			return -1;
		}
		int fullnessQuotient = 0;
		for (int i = 2; i < 10; i++) {
			if (isConvertableToBaseWithNoZeroes(n, i) == 1) {
				fullnessQuotient++;
			}
		}
		return fullnessQuotient;
	}

	public static int isConvertableToBaseWithNoZeroes(int n, int base) {
		int isConvertableToBaseNoZeroes = 1;
		int quotient = n;
		int remainder = 0;
		while (quotient != 0) {
			remainder = quotient % base;
			if (remainder == 0) {
				return isConvertableToBaseNoZeroes = 0;
			}
			quotient /= base;
		}
		return isConvertableToBaseNoZeroes;
	}
}
