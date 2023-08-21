package MaharishiCodingChallenges;

public class Is121Array {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 1 };
		int[] numbers2 = { 1, 1, 2, 2, 2, 1, 1 };
		int[] numbers3 = { 1, 1, 2, 2, 2, 1, 1, 1 };
		int[] numbers4 = { 1, 1, 2, 1, 2, 1, 1 };
		int[] numbers5 = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 };
		int[] numbers6 = { 1, 1, 1, 1, 1, 1 };
		int[] numbers7 = { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 };
		int[] numbers8 = { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2 };
		int[] numbers9 = { 2, 2, 2 };
		
		System.out.println(is121Array(numbers1));
		System.out.println(is121Array(numbers2));
		System.out.println(is121Array(numbers3));
		System.out.println(is121Array(numbers4));
		System.out.println(is121Array(numbers5));
		System.out.println(is121Array(numbers6));
		System.out.println(is121Array(numbers7));
		System.out.println(is121Array(numbers8));
		System.out.println(is121Array(numbers9));
	}


	public static int is121Array(int[] a) {
		int len = a.length;
		int is121Array = 1;
		if (a[0] != 1 || a[len - 1] != 1) {
			return is121Array = 0;
		}
		int count = 1;
		int index = 1;
		while (a[index] == 1) {
			count++;
			index++;
			if (index == len) {
				return is121Array = 0;
			}
		}
		while (index < len - count) {
			if (a[index] != 2) {
				return is121Array = 0;
			}
			index++;
		}
		while (index < len) {
			if (a[index] != 1) {
				return is121Array = 0;
			}
			index++;
		}
		return is121Array;
	}
	
    static int is121Array2(int[] a) {
        if (a.length < 3 || a[0] != 1 || a[a.length - 1] != 1)
            return 0;

        int i, j;
        boolean flag = false;
        for (i = 0, j = a.length - 1; i < a.length && j >= 0 && i <= j; i++, j--) {
            if (a[i] != 1 || a[j] != 1) {
                if (a[i] != 2 || a[j] != 2)
                    return 0;
                else {
                    flag = true;
                    break;
                }
            }
        }

        for (int index = i; index <= j; index++) {
            if (a[index] != 2)
                return 0;
        }

        if (flag) return 1;
        return 0;
    }
}
