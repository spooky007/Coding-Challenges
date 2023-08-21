package MaharishiCodingChallenges;

public class FactorTwoCount {

	public static void main(String[] args) {
		System.out.println(factorTwoCount(48));
		System.out.println(factorTwoCount(27));
		System.out.println(factorTwoCount(20));
		System.out.println(factorTwoCount(8));
		System.out.println(factorTwoCount(0));
		System.out.println(factorTwoCount(1));
	}
	
	public static int factorTwoCount(int n) {
		if (n == 0) {
			return 0;
		}
		int quotient = n;
		int count = 0;
		while (quotient % 2 == 0) {
			quotient /= 2;
			count++;
		}
		return count;
	}
}
