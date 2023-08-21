package MaharishiCodingChallenges;

public class Stacked {

	public static void main(String[] args) {
		System.out.println(isStacked(3));
	}

	public static int isStacked(int a) {
		int isStacked = 0;
		int i = 0;
		int sum = 0;
		while (sum < a + 1) {
			sum += i;
			if (sum == a) {
				return isStacked = 1;
			}
			i++;
		}
		return isStacked;
	}
}
