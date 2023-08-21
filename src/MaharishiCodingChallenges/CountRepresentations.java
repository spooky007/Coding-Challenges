package MaharishiCodingChallenges;

public class CountRepresentations {

	public static void main(String[] args) {
		System.out.println(countRepresentations(12));
	}

	public static int countRepresentations(int numRupees) {
		int count = 0;
		int sum = 0;

		for (int rupee20 = 0; rupee20 <= numRupees/20; rupee20++) {
			for (int rupee10 = 0; rupee10 <= numRupees/10; rupee10++) { 
				for (int rupee5 = 0; rupee5 <= numRupees/5; rupee5++) {
					for (int rupee2 = 0; rupee2 <= numRupees/2; rupee2++) {
						for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
							sum = (20 * rupee20) + (10 * rupee10) + (5 * rupee5) + (2 * rupee2) + (1 * rupee1);
							if (sum == numRupees) {
								count++;
								break;
							}
						}
					}
				}
			}
		}
		return count;
	}
}
