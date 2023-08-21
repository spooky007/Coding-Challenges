package MaharishiCodingChallenges;

public class Eval {

	public static void main(String[] args) {

		System.out.println(eval(1.0, new int[] { 0, 1, 2, 3, 4 }));
		System.out.println(eval(3.0, new int[] {3, 2, 1}));
		System.out.println(eval(2.0, new int[] {3, -2, -1}));
		System.out.println(eval(-3.0, new int[] {3, 2, 1}));
		System.out.println(eval(2.0, new int[] {3, 2}));
		System.out.println(eval(2.0, new int[] {4, 0, 9}));
		System.out.println(eval(2.0, new int[] {10}));
		System.out.println(eval(10.0, new int[] {0, 1}));
//		System.out.println(eval(10.0, new int[] {}));
	}

	public static double eval(double x, int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		double sum = a[0];
		double coeff = x;
		for (int i = len - 1; i > 0; i--) {
			int y = i;
			double result = x;
			while (y > 1) {
				result *= x;
				y--;
			}
			sum += a[i] * result;
		}
		return sum;
	}
}
