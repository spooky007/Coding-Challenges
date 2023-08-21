package MaharishiCodingChallenges;

public class IsFineArray {

	public static void main(String[] args) {
		System.out.println(isFineArray(new int[] { 4, 7, 9, 6, 5 }));
		System.out.println(isFineArray(new int[] { 4, 9, 6, 33 }));
		System.out.println(isFineArray(new int[] { 3, 8, 15 }));
		System.out.println(isFineArray(new int[] { 4, 11, 15 }));

		
		System.out.println(isFineArray(new int[] { 3, 5, 8, 15 }));   // my test
		System.out.println(isFineArray(new int[] { 5, 7, 8, 15 }));   // my test
	}

	private static int isFineArray1(int[] a) {
		int len = a.length;
		int primeCount = 0;
		for (int i = 0; i < len; i++) {
			int abovePrime = 0;
			int belowPrime = 0;
			int found = 0;
			if (isPrime(a[i]) == 1) {
				primeCount++;
				abovePrime = a[i] + 2;
				belowPrime = a[i] - 2;
				if (isPrime(abovePrime) == 0 && isPrime(belowPrime) == 0) {
					return 0;
				}
				int k = 0;
				if (isPrime(abovePrime) == 1) {
					while (k < len) {
						if (a[k] == abovePrime) {
							found = 1;
							break;
						}
						k++;
					}
				}
				int j = 0;
				if (isPrime(belowPrime) == 1 && found == 0) {
					while (j < len) {
						if (a[j] == belowPrime) {
							found = 1;
							break;
						}
						j++;
					}
				}
				if (found == 0) {
					return 0;
				}
			}
		}
		if (primeCount == 0) {
			return 1;
		}
		return 1;
	}

	public static int isPrime(int n) {
		int i = 2;
		if (n < 2) {
			return 0;
		}
		while (i < n) {
			if (n % i == 0) {
				return 0;
			}
			i++;
		}
		return 1;
	}
	
	   static int isFineArray(int[] a) {
	        int twinPrime = 0;
	        boolean twinPrimeFlag = false;

	        for (int i = 0; i < a.length; i++) {
	            if (isPrime(a[i]) == 1) {
	                if (isPrime(a[i] - 2) == 0 && isPrime(a[i] + 2) == 0)
	                    return 0;
	                if (isPrime(a[i] - 2) == 1) {
	                    twinPrime = a[i] - 2;
	                    twinPrimeFlag = true;
	                }
	                if (isPrime(a[i] + 2) == 1) {
	                    twinPrime = a[i] + 2;
	                    twinPrimeFlag = true;
	                }
	            }

	            if (twinPrimeFlag) {
	                boolean flag = false;
	                for (int j = 0; j < a.length; j++) {
	                    if (a[j] == twinPrime) {
	                        flag = true;
	                        break;
	                    }
	                }
	                if (!flag)
	                    return 0;
	            }
	        }
	        return 1;
	    }
}
