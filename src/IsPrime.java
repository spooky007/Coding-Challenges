
public class IsPrime {

	public static void main(String[] args) {
//		System.out.println(isPrime(6));
		System.out.println(isPrime(4));
		
//		System.out.println(isPrime(5));
//		System.out.println(isPrime(7));
//		System.out.println(isPrime(11));
//		System.out.println(isPrime(2));
//		System.out.println(isPrime(0));
	}
	
	public static int isPrime(int n) {
		int isPrime = 1;
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
		return isPrime;
	}
	
    static boolean isPrime1(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 0;
    }
}
