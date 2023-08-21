package MaharishiCodingChallenges;

public class Smallest {

	public static void main(String[] args) {
//		int number = 34130924;
//		System.out.println(containsTwo(number));
		
		int number = 3;   /// try 5, 6, 7, 8
		System.out.println(smallest(0));

	}

	public static int smallest(int n) {
		if(n == 0) {
			return 0;
		}
		int smallest = 1;
		int flag = 0;
		while (flag == 0) {
			int count = 0;
			for (int i = 1; i < n + 1; i++) {
				if (containsTwo(smallest * i) == 1) {
					count++;
					continue;
				} else {
					break;
				}
			}
			if(count == n) {
				flag = 1;
			} else {
				smallest++;
			}
		}
		return smallest;
	}

	public static int containsTwo(int n) {
		int quotient = n;
		int containsTwo = 0;
		while (quotient != 0) {
			if (quotient % 10 == 2) {
				return 1;
			}
			quotient /= 10;
		}
		return containsTwo;
	}
}