package MaharishiCodingChallenges;

public class MeeraArray3 {

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] { 7, 9, 0, 10, 1 }));
		System.out.println(isMeera(new int[] { 6, 10, 8 }));
		System.out.println(isMeera(new int[] { 7, 6, 1 }));
		System.out.println(isMeera(new int[] { 9, 10, 0 }));
		System.out.println(isMeera(new int[] { 1, 1, 0, 8, 0, 9, 9, 1 }));
	}

	public static int isMeera(int[] a) {
		int len = a.length;
		int count9 = 0;
		int count1 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				count9++;
			}
			if (a[i] == 1) {
				count1++;
			}
		}
		if (count9 > 0 && count1 == 0 || count1 > 0 && count9 == 0) {
			return 0;
		}
		return 1;
	}
}
