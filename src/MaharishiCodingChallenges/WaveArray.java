package MaharishiCodingChallenges;

public class WaveArray {

	public static void main(String[] args) {
		System.out.println(isWaveArray(new int[] { 7, 2, 9, 10, 5 }));
		System.out.println(isWaveArray(new int[] { 4, 11, 12, 1, 6 }));
		System.out.println(isWaveArray(new int[] { 1, 0, 5 }));
		System.out.println(isWaveArray(new int[] { 2, 6, 3, 4 }));
	}

	public static int isWaveArray(int[] a) {
		int len = a.length;
		if (len == 1) {
			return 1;
		}
		for (int i = 0; i < len - 1; i++) {
			if (a[i] % 2 == 0) {
				if (a[i + 1] % 2 == 0) {
					return 0;
				}
			} else {
				if (a[i + 1] % 2 == 1) {
					return 0;
				}
			}
		}
		return 1;
	}
}
