package MaharishiCodingChallenges;

public class NextPerfectSquare {

	public static void main(String[] args) {
		System.out.println(nextPerfectSquare(-10));
	}
	
	public static int nextPerfectSquare(int n) {
		int perfectSquare = 0;
		boolean flag = true;
		n = n + 1;
		while (flag) {
			if (Math.sqrt(n) % 1  != 0) {
				n++;
			} else {
				perfectSquare = n;
				flag = false;
			}
		}
		return perfectSquare;
	}
}
