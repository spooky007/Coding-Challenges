package MaharishiCodingChallenges;

public class GetExponent {

	public static void main(String[] args) {
		System.out.println(getExponent1(27, 3));
		System.out.println(getExponent1(28, 3));
		System.out.println(getExponent1(280, 7));
		System.out.println(getExponent1(-250, 5));
		System.out.println(getExponent1(18, 1));
		System.out.println(getExponent1(128, 4));
	}

	public static int getExponent(int n, int p) {
		if (p <= 1) {
			return -1;
		}
		int temp = Integer.MIN_VALUE;
		for (int i = 0;; i++) {
			if (n % Math.pow(p, i) == 0) {
				temp = i;
			} else {
				break;
			}
		}
		return temp;
	}

	static int getExponent1(int n, int p) {
		if (p <= 1)
			return -1;
		int count = 0;
		n = n > 0 ? n : -n;
		for (int num = n; num > 0; num /= p) {
			if (num % p == 0)
				count++;
			else
				break;
		}
		return count;
	}

	static int getExponent2(int n, int p) {
		if (p <= 1)
			return -1;

		int count = 0;
		n = n > 0 ? n : -n;

		while (n > 0) {
			if (n % p == 0)
				count++;
			else
				break;

			n /= p;
		}
		return count;
	}
}
