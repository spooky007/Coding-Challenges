package MaharishiCodingChallenges;

public class IsSystematicallyIncreasing {

	public static void main(String[] args) {
		System.out.println(isSystematicallyIncreasing(new int[]{1}));
		System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
		System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3}));
		System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
		System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
		System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));

//		System.out.println(isSystematicallyIncreasing(new int[] { 1 }));
//		System.out.println(isSystematicallyIncreasing(new int[] { 1, 1, 2 }));
//		System.out.println(isSystematicallyIncreasing(new int[] { 1, 1, 2, 1, 2, 3 }));
//		System.out.println(isSystematicallyIncreasing(new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4 }));
//		System.out.println(isSystematicallyIncreasing(new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5 }));
	}

	public static int isSystematicallyIncreasing1(int[] a) {
		int len = a.length;
		int increases = 1;
		int series = 1;
		int index = 0;
		while (index < len) {
			index += series;
			series++;
		}
		if (index != len) {
			return 0;
		}
		int[] numbers = new int[index];
		series = 1;
		int x = 0;
		for (int i = 0; i < index;) {
			x = series;
			int sth = 1;
			while (x > 0) {
				numbers[i++] = sth++;
				x--;
			}
			series++;
		}
		int numbersCount = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] != numbers[numbersCount++]) {
				return increases = 0;
			}
		}
		return increases;
	}
	
    static int isSystematicallyIncreasing(int[] a) {
        int index = 0;
        int i = 0;
        do {
            for (int j = 1; j < i + 1; j++) {
                if (a[index] != j) {
                	return 0;
                }
                index++;
            }
            i++;
        } while (index < a.length);

        return 1;
    }

}
