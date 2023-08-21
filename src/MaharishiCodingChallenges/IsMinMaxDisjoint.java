package MaharishiCodingChallenges;

public class IsMinMaxDisjoint {

	public static void main(String[] args) {
		int[] numbers1 = { 5, 4, 3, 2, 1 };
		int[] numbers2 = {18, -1, 3, 4, 0};
		int[] numbers3 = {9, 0, 5, 9};
		int[] numbers4 = {0, 5, 18, 0, 9};
		int[] numbers5 = {7, 7, 7, 7};
		int[] numbers6 = {};
		int[] numbers7 = { 1, 2 };
		int[] numbers8 = { 1 };
		System.out.println(isMinMaxDisjoint1(numbers1));
	}

	public static int isMinMaxDisjoint(int[] a) {
		int len = a.length;
		if (len < 0) {
			return 0;
		}
		int maxValue = a[0];
		int minValue = a[0];
		int minCount = 0;
		int maxCount = 0;
		int isMinMaxDisjoint = 1;
		for (int i = 1; i < len; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
			if (a[i] < minValue) {
				minValue = a[i];
			}
		}
		if (minValue == maxValue) {
			return isMinMaxDisjoint = 0;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] == minValue) {
				minCount++;
				if (minCount > 1) {
					return isMinMaxDisjoint = 0;
				}
			}
			if (a[i] == maxValue) {
				maxCount++;
				if (maxCount > 1) {
					return isMinMaxDisjoint = 0;
				}
			}
		}
		for (int i = 0; i < len - 1; i++) {
			if (a[i] == minValue && a[i + 1] == maxValue) {
				return isMinMaxDisjoint = 0;
			}
			if (a[i] == maxValue && a[i + 1] == minValue) {
				return isMinMaxDisjoint = 0;
			}
		}
		return isMinMaxDisjoint;
	}
	
    public static int isMinMaxDisjoint1(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int minTimes = 1;
        int maxTimes = 1;
        int minIndex = 0;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                maxTimes++;
            } else if (a[i] == min) {
                minTimes++;
            }
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
                maxTimes = 1;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
                minTimes = 1;
            }
        }
        if (minTimes == 1 && maxTimes == 1 && ((minIndex - maxIndex) < -1 || (minIndex - maxIndex) > 1)) {
            return 1;
        } else {
            return 0;
        }
    }
}
