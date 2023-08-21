package MaharishiCodingChallenges;

public class IsMercurial {

	public static void main(String[] args) {
		System.out.println(isMercurial(new int[] { 1, 2, 10, 3, 15, 1, 2, 2 }));
		System.out.println(isMercurial(new int[] { 5, 2, 10, 3, 15, 1, 2, 2 }));
		System.out.println(isMercurial(new int[] { 1, 2, 10, 3, 15, 16, 2, 2 }));
		System.out.println(isMercurial(new int[] { 3, 2, 18, 1, 0, 3, -11, 1, 3 }));
		System.out.println(isMercurial(new int[] { 2, 3, 1, 1, 18 }));
		System.out.println(isMercurial(new int[] { 8, 2, 1, 1, 18, 3, 5 }));
		System.out.println(isMercurial(new int[] { 3, 3, 3, 3, 3, 3 }));
		System.out.println(isMercurial(new int[] { 1 }));
		System.out.println(isMercurial(new int[] {}));
		System.out.println(isMercurial(new int[] { 8, 2, 1, 1, 18, 3, 5, 1}));
		
	}

	public static int isMercurial1(int[] a) {
		int len = a.length;
		int flag1 = 0;
		int flag2 = 0;
 		for (int i = 0; i < len; i++) {
			if (a[i] == 1 && flag1 == 0) {
				flag1 = 1;
			}
			if (flag1 == 1 && a[i] == 3) {
				flag2 = 1;
			}
			if (flag1 == 1 && flag2 == 1 && a[i] == 1) {
				return 0;
			}
		}
 		return 1;
	}
	
    static int isMercurial(int[] a) {
        boolean precedingOneFlag = false;
        int indexOf3 = -1;
        int indexOf1 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                indexOf1 = i;
            if (a[i] == 3) {
                indexOf3 = i;
            }
            if (indexOf1 != -1 && indexOf3 > indexOf1) {
                precedingOneFlag = true;
            }
            if (precedingOneFlag && a[i] == 1) {
                return 0;
            }
        }
        return 1;
    }
}
