package MaharishiCodingChallenges;

public class IsVanilla {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 1, 11, 1111, 1111111 };
		int[] numbers2 =  {11, 101, 1111, 11111};
		int[] numbers3 = { 1 };
		int[] numbers4 = { 11, 22, 13, 34, 125 };
		int[] numbers5 = { 9, 999, 99999, -9999 };
		int[] numbers6 = { };
		
		System.out.println(isVanilla2(numbers5));
	}

	public static int isVanilla(int[] a) {
		int len = a.length;
		int isVanilla = 1;
		if (len == 0 || len == 1) {
			return isVanilla = 1;
		}
		int temp = Math.abs(a[1] % 10);
		for (int i = 0; i < len; i++) {
			int j = Math.abs(a[i]);
			while (j != 0) {
				int remainder = j % 10;
				if (remainder != temp) {
					return isVanilla = 0;
				}
				j /= 10;
			}
		}
		return isVanilla;
	}
	
	  static int isVanilla2(int a[]) {
	        boolean isVanilla = true;
	        int firstDigit = 0;
	        int secondDigit = 0;

	        firstDigit = a[0] % 10;

	        for (int i = 0; i < a.length; i++) {

	            while (a[i] != 0) {
	                // System.out.println(a[i]);
	                secondDigit = a[i] % 10;
	                // System.out.println(secondDigit);

	                if(a[i] != firstDigit || secondDigit != firstDigit) {
	                    isVanilla = false;
	                    break;
	                }
	                a[i] /= 10;
	            }
	        }
	        if (isVanilla) {
	            return 1;
	        }
	        return 0;
	    }

}
