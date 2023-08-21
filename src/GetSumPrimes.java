import java.util.Arrays;

/**
 * the getSumPrimes gets a collection of prime numbers between start and end.
 * assume that end is always bigger than start.
 * 
 * @author Eric
 *
 */
public class GetSumPrimes {

	public static void getSumPrimes(int start, int end) {
		int i, j, k, len, flag, count;
		k = 0;
		len = end - start;
		int[] primes = new int[len];
		for (i = start; i <= end; i++) {

			// Skip 0 and 1 as they are
			// neither prime nor composite
			if (i == 1 || i == 0)
				continue;

			// flag variable to tell
			// if i is prime or not
			flag = 1;

			for (j = 2; j < i; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			// flag = 1 means i is prime
			// and flag = 0 means i is not prime
			if (flag == 1) {
				System.out.print(" " + i);
			}
		}
	}

	public static void main(String[] args) {
		getSumPrimes(1, 10);
	}
}
