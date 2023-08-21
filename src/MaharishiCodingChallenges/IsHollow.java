package MaharishiCodingChallenges;

public class IsHollow {

	public static void main(String[] args) {
		System.out.println(isHollow(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 }));
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4 }));
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 3, 4 }));
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 }));
		System.out.println(isHollow(new int[] { 3, 8, 3, 0, 0, 0, 3, 3 }));
		System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 }));
		System.out.println(isHollow(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 }));
		System.out.println(isHollow(new int[] { 0, 0, 0 }));
		System.out.println(isHollow(new int[] { 1, 1, 1, 1, 0, 0, 0, 2, 0, 0, 1, 2, 18 }));
		System.out.println(isHollow(new int[] { 1, 1, 1, 0, 0, 1, 2, 18 }));
	}
	
	public static int isHollow1(int[] a) {
		int len = a.length;
		int before = 0;
		int zeroes = 0;
		int after = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] != 0 && zeroes == 0) {
				before++;
			}
			if (a[i] == 0) {
				if (after != 0) {
					return 0;
				}
				zeroes++;
			}
			if (a[i] != 0 && zeroes != 0) {
				if (zeroes < 3) {
					return 0;
				}
				if (after > before) {
					return 0;
				}
				after++;
			}
		}
		if (zeroes < 3 || after != before) {
			return 0;
		}
		return 1;
	}
	
    static int isHollow(int[] a) {
        if (a.length < 3)
            return 0;
        int zeroCount = 0;

        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            if ((a[i] == 0 && a[j] != 0) || (a[i] != 0 && a[j] == 0)) {
                return 0;
            }
            if (i == j && a[i] == 0) {
                zeroCount++;
            } else {
                if (a[i] == 0)
                    zeroCount++;

                if (a[j] == 0)
                    zeroCount++;
            }
        }

        if (zeroCount >= 3) return 1;
        return 0;
    }
}
