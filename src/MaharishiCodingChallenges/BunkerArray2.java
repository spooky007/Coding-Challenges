package MaharishiCodingChallenges;

public class BunkerArray2 {

	public static void main(String[] args) {
		System.out.println(isBunker(11));
		System.out.println(isBunker(22));
		System.out.println(isBunker(8));
		System.out.println(isBunker(0));
	}
	
	public static int isBunker(int n) {
		int sum = 1;
		for (int i = 1; sum < n; i++) {
			sum += i;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}
}
