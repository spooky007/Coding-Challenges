package MaharishiCodingChallenges;

public class IsConsecutiveFactored {

	public static void main(String[] args) {
		System.out.println(isConsecutiveFactored(24));
		System.out.println(isConsecutiveFactored(105));
		System.out.println(isConsecutiveFactored(90));
		System.out.println(isConsecutiveFactored(23));
		System.out.println(isConsecutiveFactored(15));
		System.out.println(isConsecutiveFactored(2));
		System.out.println(isConsecutiveFactored(0));
		System.out.println(isConsecutiveFactored(-12));
	}

	public static int isConsecutiveFactored1(int n) {
		int firstFactor = -1;
		int secondFactor = -1;
		if (n <= 3) {
			return 0;
		}
		int i = 2;
		int quotient = 0;
		while (i < n / 2) {
			if (n % i == 0) {
				firstFactor = secondFactor;
				secondFactor = i;
			}
			if (secondFactor - firstFactor == 1) {
				return 1;
			}
			i++;
		}
		return 0;
	}
	
	   static int isConsecutiveFactored(int n) {
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0 && n % (i + 1) == 0)
	                return 1;
	        }
	        return 0;
	    }
}
