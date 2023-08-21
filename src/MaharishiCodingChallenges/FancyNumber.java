package MaharishiCodingChallenges;

public class FancyNumber {

	public static void main(String[] args) {
		System.out.println(isFancy(1));
		System.out.println(isFancy(5));
		System.out.println(isFancy(7));
		System.out.println(isFancy(17));
		System.out.println(isFancy(61));
		System.out.println();
		System.out.println(isFancy(55));
	}

	public static int isFancy(int n) {
		if (n == 1) {
			return 1;
		}
		int temp1 = 1;
		int temp2 = 1;
		int next = 0;
		while (next < n) {
			next = (3 * temp2) + (2 * temp1);
			temp1 = temp2;
			temp2 = next;
		}
		if (next == n) {
			return 1;
		}
		return 0;
	}
}
