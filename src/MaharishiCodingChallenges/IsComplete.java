package MaharishiCodingChallenges;

public class IsComplete {

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] { 36, -28 }));
		System.out.println(isComplete(new int[] { 36, 28 }));
		System.out.println(isComplete(new int[] { 4 }));
		System.out.println(isComplete(new int[] { 3, 2, 1, 1, 5, 6 }));
		System.out.println(isComplete(new int[] { 3, 7, 23, 13, 107, -99, 97, 81 }));
	}

	public static int isComplete1(int[] a) {
		int len = a.length;
		if (len <= 1) {
			return 0;
		}
		int square = 0;
		int isEven = 0;
		int sumIs8 = 0;
		for (int i = 0; i < len - 1; i++) {
			int j = i + 1;
			while (sumIs8 == 0 && j < len) {
				if (a[i] + a[j] == 8) {
					sumIs8 = 1;
				}
				j++;
			}
			if (isEven == 0 && a[i] % 2 == 0) {
				isEven = 1;
			}
			if (square == 0 && isSquare(a[i]) == 1) {
				square = 1;
			}
			if (square == 1 && isEven == 1 && sumIs8 == 1) {
				return 1;
			}
		}
		return 0;
	}

	public static int isSquare(int n) {
		int i = 0;
		int square = 0;
		while (square < n) {
			square = i * i;
			i++;
		}
		if (square == n) {
			return 1;
		} else {
			return 0;
		}
	}
	
	static int isComplete(int[] a) {
        boolean squareFlag = false;
        boolean evenFlag = false;
        boolean sumFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                evenFlag = true;

            if (a[i] != 1 && IsSquare.isSquare(a[i]) == 1)  // if you don't consider 1 a perfect square 
                squareFlag = true;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    sumFlag = true;
                    break;
                }
            }

            if (evenFlag && squareFlag && sumFlag)
                return 1;
        }

        return 0;
    }
}
