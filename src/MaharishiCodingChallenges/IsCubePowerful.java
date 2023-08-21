package MaharishiCodingChallenges;

public class IsCubePowerful {

	public static void main(String[] args) {
		System.out.println(isCubePowerful(153));
		System.out.println(isCubePowerful(370));
		System.out.println(isCubePowerful(371));
		System.out.println(isCubePowerful(407));
		System.out.println(isCubePowerful(87));
		System.out.println(isCubePowerful(0));
		System.out.println(isCubePowerful(-81));
	}

	public static int isCubePowerful(int n) {
		int isCubePoweful = 1;
		int quotient = n;
		int sum = 0;
		if (n < 1) {
			return 0;
		}
		while (quotient != 0) {
			int remainder = quotient % 10;
			sum += (int) Math.pow(remainder, 3);
			quotient /= 10;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}

	static int isCubePowerful1(int n) {
		if (n <= 0) {
			return 0;
		}
		int nCopy = n;
		int sum = 0;
		while (nCopy > 0) {
			int digit = nCopy % 10;
			nCopy /= 10;
			int product = 1;

			for (int i = 1; i <= 3; i++) {
				product *= digit;
			}
			sum += product;
		}

		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
