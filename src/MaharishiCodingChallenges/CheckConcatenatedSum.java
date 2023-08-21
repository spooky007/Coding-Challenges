package MaharishiCodingChallenges;

public class CheckConcatenatedSum {

	public static void main(String[] args) {
//		System.out.println(concatenate(3, 5));
		System.out.println(checkConcatenatedSum1(198, 2));
//		System.out.println(checkConcatenatedSum1(198, 3));
//		System.out.println(checkConcatenatedSum1(2997, 3));
//		System.out.println(checkConcatenatedSum1(2997, 2));
//		System.out.println(checkConcatenatedSum1(13332, 4));
//		System.out.println(checkConcatenatedSum1(9, 1));
	}
	
	public static int checkConcatenatedSum(int n, int catlen) {
		int isConcatenatedSum = 1;
		int quotient = n;
		int sum = 0;
		while (quotient != 0) {
			int remainder = quotient % 10;
			sum += concatenate(remainder, catlen);
			quotient /= 10;
		}
		if (sum != n) {
			return 0;
		}
		return isConcatenatedSum;
	}
	
	public static int concatenate(int n, int catlen) {
		int i = catlen;
		int conc = 0;
		while (i > 0) {
			conc += (n * (int) Math.pow(10, i));
			i--;
		}
		return conc / 10;
	}
	
	  public static int checkConcatenatedSum1(int n, int catlen) {
	        StringBuilder catlenStr = new StringBuilder();
	        for (int i = 0; i < catlen; i++) {
	            catlenStr.append(1);
	        }
	        if (n % Integer.valueOf(catlenStr.toString()) == 0) {
	            return 1;
	        }
	        return 0;
	    }
}
