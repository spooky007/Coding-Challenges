package MaharishiCodingChallenges;

public class IsNormal {

	public static void main(String[] args) {
//		System.out.println(isNormal(0));
//		System.out.println(isNormal(1));
//		System.out.println(isNormal(2));
//		System.out.println(isNormal(3));
//		System.out.println(isNormal(4));
//		System.out.println(isNormal(5));
		System.out.println(isNormal(6));
		System.out.println(isNormal(7));
		System.out.println(isNormal(8));
		System.out.println(isNormal(9));
		System.out.println(isNormal(10));
	}
	
	public static int isNormal(int n) {
		int i = 2;
		if (n < 2) {
			return 1;
		}
		while (i < n) {
			if (n % i == 0 && i % 2 == 1) {
				return 0;
			}
			i++;
		}
		return 1;
	}
 }
