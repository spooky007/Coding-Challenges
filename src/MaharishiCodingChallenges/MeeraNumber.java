package MaharishiCodingChallenges;

public class MeeraNumber {
	public static void main(String[] args) {
		System.out.println(isMeera(6));
		System.out.println(isMeera(30));
		System.out.println(isMeera(21));
	}

	public static int isMeera(int n) {
		int factorCount = 0;
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				factorCount++;
			}
			i++;
		}
		i = 2;
		while (i < n) {
			if (n % i == 0 && i == factorCount) {
				return 1;
			}
			i++;
		}
		return 0;
	}
	
}
