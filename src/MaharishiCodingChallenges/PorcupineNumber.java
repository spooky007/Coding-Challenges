package MaharishiCodingChallenges;

public class PorcupineNumber {

	public static void main(String[] args) {
		System.out.println(findPorcupineNumber1(409));
//		System.out.println(isPrime(2));

	}

	public static int findPorcupineNumber(int n) {
		int isPorcupineNumber = 0;
		int nextPrime = 0;
		while (nextPrime == 0) {
			if (isPrime(n) == 1) {
				if (n % 10 == 9) {
					isPorcupineNumber = 1;
				}
				int x = n++;
				int isNextPrimeOk = 0;
				while (isNextPrimeOk == 0) {
					if (isPrime(n) == 1) {
						if (n % 10 == 9) {
							System.out.println("hello");
							return n;
						} else {
							isPorcupineNumber = 0;
							break;
						}
					}
					x++;
				}
			}
			n++;
		}
		return n;
	}

	private static int findPorcupineNumber1(int n) {
		int porcupineNumber = 0;
		int nextPrime = 0;
		while (porcupineNumber == 0) {
			n++;
			if (isPrime(n) == 1 && n % 10 == 9) {
				porcupineNumber = n;
//				nextPrime = n + 1;
//				while (true) {
//					if (isPrime(nextPrime) == 1 && nextPrime % 10 == 9) {
//						porcupineNumber = n;
//					} else {
//						break;
//					}
//				}
			} else {
				continue;
			}
			int x = n;
			while (true) {
				x++;
				if (isPrime(x) == 1) {
					if (x % 10 == 9) {
						porcupineNumber = n;
						return porcupineNumber;
					} else {
						porcupineNumber = 0;
					}
					break;
				}
			}
		}
		return porcupineNumber;
	}

	private static int isPrime(int n) {
		if (n < 2) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
