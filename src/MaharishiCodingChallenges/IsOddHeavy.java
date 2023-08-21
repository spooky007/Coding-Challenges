package MaharishiCodingChallenges;

public class IsOddHeavy {

	public static void main(String[] args) {
		int[] numbers1 = { 1 };
		int[] numbers2 = { 2 };
		int[] numbers3 = { 1, 1, 1, 1, 1, 1 };
		int[] numbers4 = { 2, 4, 6, 8, 11 };
		int[] numbers5 = { -2, -4, -6, -8, -11 };
		
		System.out.println(isOddHeavy(numbers5));

	}

	public static int isOddHeavy(int[] a) {
		int isOddHeavy = 0;
		int len = a.length;
		int[] odds = new int[len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 != 0) {
				odds[index++] = a[i];
				isOddHeavy = 1;
			}
		}
		if (isOddHeavy == 0) {
			return isOddHeavy;
		}
		for (int i = 0; i < len; i++) {
			int j = 0;
			while (j < index) {
				if (a[i] > odds[j]) {
					return isOddHeavy = 0;
				}
				j++;
			}
		}
		return isOddHeavy;
	}
	
	   static int isOddHeavy1(int[] a) {
	        boolean oddFlag = false;
	        int smallestOdd = Integer.MAX_VALUE;
	        int largestEven = Integer.MIN_VALUE;

	        for (int anA : a) {
	            if (anA % 2 != 0) {
	                oddFlag = true;

	                if (anA < smallestOdd)
	                    smallestOdd = anA;
	            } else {
	                if (anA > largestEven)
	                    largestEven = anA;
	            }
	        }

	        if (oddFlag && smallestOdd > largestEven)
	            return 1;
	        else return 0;
	    }
}
