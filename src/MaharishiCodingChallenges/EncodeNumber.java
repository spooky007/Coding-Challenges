package MaharishiCodingChallenges;

import java.util.Arrays;

public class EncodeNumber {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(encodedNumber(2)));
		System.out.println(Arrays.toString(encodedNumber(6)));
		System.out.println(Arrays.toString(encodedNumber(14)));
		System.out.println(Arrays.toString(encodedNumber(24)));
		System.out.println(Arrays.toString(encodedNumber(1200)));
		System.out.println(Arrays.toString(encodedNumber(1)));
		System.out.println(Arrays.toString(encodedNumber(-18)));
	}
	
	public static int[] encodedNumber(int n) {
		if (n <= 1) {
			return null;
		}
		int[] primeFactors = new int[n];
		int index = 0;
		int i = 2;
		while ( i <= n) {
			if (n % i == 0 && isPrime(i) == 1) {
				primeFactors[index++] = i; 
			}
			i++;
		}
		int quotient = n;
		int[] encodedNumbers = new int[n];
		i = 0;
		int j = 0;
		while (quotient > 1 || i < index) {
			int remainder = quotient % primeFactors[i];
			if (remainder == 0) {
				encodedNumbers[j++] = primeFactors[i];
				quotient /= primeFactors[i];
			} else {
				i++;
			}
					
		}
		int[] finalEncodedNumbers = new int[j];
		for (int k = 0; k < j; k++) {
			finalEncodedNumbers[k] = encodedNumbers[k];
		}
		return finalEncodedNumbers;
		
	}

	public static int isPrime(int n) {
		int isPrime = 1;
		int count = 0;
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				count++;
			}
			if (count > 0) {
				return isPrime = 0;
			}
			i++;
		}
		return isPrime;
	}
}
