package MaharishiCodingChallenges;

public class IsRailRoadTie {

	public static void main(String[] args) {
		int[] digits1 = { 1, 2, 3, 0, 2, 2 };
		int[] digits2 = { 0, 1, 2, 0, 3, 4 };
		int[] digits3 = { 1, 2, 0, 0, 3, 4 };
		int[] digits4 = {};
		int[] digits5 = { 0 };

		int[] numbers1 = { 1, 2, 0, 3, -18, 0, 2, 2 };
		int[] numbers2 = { 1, 2 };
		int[] numbers3 = { 1, 2, 0, 1, 2, 0, 1, 2 };
		int[] numbers4 = { 3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3 };
		int[] numbers5 = { 0, 0, 0, 0 };
		int[] numbers6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] numbers7 = { 1, 3, 0, 3, 5, 0 };

//		System.out.println(isRailRoadTie(numbers7));
		System.out.println(isRailRoadTie(digits5));
	}

	public static int isRailRoadTie(int[] a) {
		int len = a.length;
		int isRailRoadTie = 0;
		if (len < 2) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] != 0) {
				isRailRoadTie = 1;
				break;
			}
		}
		if (isRailRoadTie == 0) {
			return isRailRoadTie = 0;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				if (i == 0 || i == len - 1) {
					return isRailRoadTie = 0;
				}
				if (a[i - 1] != 0 && a[i + 1] != 0) {
					isRailRoadTie = 1;
				} else {
					return isRailRoadTie = 0;
				}
			}
			if (a[i] != 0) {
				if (i == 0) {
					if (a[i + 1] == 0) {
						return isRailRoadTie = 0;
					}
				}
				if (i == len - 1) {
					if (a[len - 2] == 0) {
						return isRailRoadTie = 0;
					}
				}
				if ( (i != 0 && i != len -1 ) && a[i + 1] != 0 && a[i - 1] != 0) {
					return isRailRoadTie = 0;
				}
			}
//				if (a[i] != 0) {
//					if ((a[i - 1] != 0 && (a[i + 1] == 0 || i == len - 1))
//							|| ((a[i - 1] == 0 || i == 0) && a[i + 1] != 0)) {
//						isRailRoadTie = 1;
//					} else {
//						return isRailRoadTie = 0;
//					}
//				}

		}
		return isRailRoadTie;
	}
}
