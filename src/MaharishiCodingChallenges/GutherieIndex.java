package MaharishiCodingChallenges;

public class GutherieIndex {

	public static void main(String[] args) {
		System.out.println(gutherieIndex(1));
		System.out.println(gutherieIndex(2));
		System.out.println(gutherieIndex(3));
		System.out.println(gutherieIndex(4));
		System.out.println(gutherieIndex(42));
	}

	public static int gutherieIndex(int n) {
		int index = 0;
		if (n == 1 || n == 0) {
			return 0;
		}
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n * 3) + 1;
			}
			index++;
		}
		return index;
	}
}
