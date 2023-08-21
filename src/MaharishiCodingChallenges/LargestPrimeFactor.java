package MaharishiCodingChallenges;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		System.out.println(largestPrimeFactor1(10));
		System.out.println(largestPrimeFactor1(6936));
		System.out.println(largestPrimeFactor1(1));
	}

	public static int largestPrimeFactor(int n) {
		int i = 1;
		int largestPrime = 0;
		while (i < n) {
			if (n % i == 0 && isPrime(i) == 1) {
				if (i > largestPrime) {
					largestPrime = i;
				}
			}
			i++;
		}
		return largestPrime;
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
	
    public static int largestPrimeFactor1(int n) {
        if (n == 1) {
            return 0;
        }
        int result = -1;
        while (n % 2 == 0) {
            result = 2;
            n >>= 1;
        }
        int divideNum = 3;
        while (n != 1) {
            if (n % divideNum == 0) {
                n /= divideNum;
                result = divideNum;
            } else {
                divideNum += 2;
            }
        }
        return result;
    }
}
