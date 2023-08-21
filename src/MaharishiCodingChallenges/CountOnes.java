package MaharishiCodingChallenges;

public class CountOnes {

	public static void main(String[] args) {
		System.out.println(countOnes(9));
		System.out.println(countOnes(5));
		System.out.println(countOnes(15));
		System.out.println(countOnes(2));
	}
	
	public static int countOnes(int n) {
		int count = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				count++;
			}
			n /= 2;
		}
		return count;
	}
}
