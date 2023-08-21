import java.util.Arrays;

public class Factors {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(factors(8)));
		System.out.println(Arrays.toString(factors(0)));
		System.out.println(Arrays.toString(factors(2)));
		System.out.println(Arrays.toString(factors(-2)));
		System.out.println(Arrays.toString(factors(-8)));
		
//		System.out.println((factors(2)).length);
	}

	public static int[] factors(int n) {
		int count = 0;
		int i = 1;
		boolean negative = false;
		if (n < 0) {
			n = -1 * n;
			negative = true;
		}
		while (i <= n) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		int[] factors = new int[count];
		int k = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors[k++] = i;
			}
		}
		if (negative) {
			int[] newFactors = new int[count * 2];
			int x = 0;
			while (x < newFactors.length) {
				for (int j = 0; j < count; j++) {
					newFactors[x++] = -factors[j];
				}
				for (i = 0; i < count; i++) {
					newFactors[x++] = factors[i];
				}
			}
			return newFactors;
		}
		return factors;
	}
}
