package MaharishiCodingChallenges;

public class HasKSmallFactors {

	public static void main(String[] args) {
		System.out.println(hasKSmallFactors(7, 30));
		System.out.println(hasKSmallFactors(6, 14));
		System.out.println(hasKSmallFactors(6, 30));
	}
	
	public static boolean hasKSmallFactors1(int k, int n) {
		int[] factors = new int[n];
		int j = 0;
		if ( k < 0 || n < 0) {
			return false;
		}
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && i < k) {
				factors[j++] = i;
			}
		}
		if (j < 2) {
			return false;
		}
		for (int m = 0; m < j; m++) {
			for (int l = m + 1; l < j; l++) {
				if (factors[m] * factors[l] == n) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasKSmallFactors(int k, int n) {
        if (k <0 || n <0)
            return false;
        for (int factor = 1; factor < k; factor++) {
            if (n % factor == 0) {
                int nextFactor = n / factor;
                if (nextFactor < k)
                    return true;
            }
        }
        return false;
    }
}
