package MaharishiCodingChallenges;

public class SmartNumber {

	public static void main(String[] args) {
		System.out.println(isSmart(11));
		System.out.println(isSmart(22));
		System.out.println(isSmart(8));
		System.out.println(isSmart(0));
	}
	
	public static int isSmart(int n) {
		int sum = 1;
		for (int k = 1; sum < n; k++) {
			sum += k;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
