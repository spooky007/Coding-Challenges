package MaharishiCodingChallenges;

public class FindSmallestBEQ {

	public static void main(String[] args) {
//		System.out.println(findSmallestBEQ());
		System.out.println(findSmallestBEQNumber());
	}

	private static int findSmallestBEQ() {
		int count = 0;
		int i = 1;
		int cube = 0;
		while (count  < 6) {
			cube = i * i * i;
			count = 0;
			if (cube < 6000) {
				i++;
				continue;
			}
			int quotient = cube;
			while (quotient > 0) {
				if (quotient % 10 == 6) {
					count++;
				}
				quotient /= 10;
			}
			if (count == 4) {
				return i;
			}
			i++;
		}
		return i;
	}
	
	   static int findSmallestBEQNumber() {
	        int beqNumber;
	        int number = 1;
	        while (true) {
	            beqNumber = number * number * number;
	            int countOf6 = 0;

	            while (beqNumber > 0) {
	                int digit = beqNumber % 10;
	                beqNumber /= 10;
	                if (digit == 6)
	                    countOf6++;
	            }
	            if (countOf6 == 4) {
	                return number;
	            }
	            number++;
	        }
	    }
}
