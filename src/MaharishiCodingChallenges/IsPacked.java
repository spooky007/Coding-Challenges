package MaharishiCodingChallenges;

public class IsPacked {

	public static void main(String[] args) {
		int[] numbers1 = { 2, 2, 1 };
		int[] numbers2 = { 2, 2, 1, 2, 2 };
		int[] numbers3 = { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 };
		int[] numbers4 = { 7, 7, 7, 7, 7, 7, 7, 1 };
		int[] numbers5 = { 7, 7, 7, 7, 1, 7, 7, 7 };
		int[] numbers6 = {};
		int[] numbers7 = { 1, 2, 1 };
		int[] numbers8 = { 2, 1, 1 };
		int[] numbers9 = { -3, -3, -3 };
		int[] numbers10 = { 0, 2, 2 };
		int[] numbers11 = { 2, 1, 2 };
		int[] numbers12 = { 1 };
		System.out.println(isPacked1(numbers7));
	}

	private static int isPacked(int[] a) {
		int isPacked = 1;
		int len = a.length;
		if (len == 0) {
			return isPacked = 1;
		}
		int[] temps = new int[len]; // this array keeps track of temporary integers already marked/counted
		int index = 0; // this tracks the index of temps array
		int temp = a[0];
		int count = a[0];
		for (int i = 1; i < len; i++) {
			if (a[i] < 0) {
				return isPacked = 0;
			}
			if (a[i] == temp) {
				if (count > 1) {
					count--;
				} else {
					return isPacked = 0;
				}
			} else {
				if (count == 1) {
					temps[index++] = temp;
					temp = a[i];
					count = a[i];
				} else {
					return isPacked = 0;
				}
			}
			int j = 0;
			while (j < index) {
				if (temps[j] == temp) {
					return isPacked = 0;
				}
				j++;
			}
		}
		return isPacked;
	}
	
    static int isPacked1(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i = j) {
            int count = 0;
            if (a[i] <= 0)
                return 0;
            for (j = i; j < i + a[i]; j++) {
                if (a[i] != a[j]) {
                    return 0;
                }
            }

            for (int anA : a) {
                if (anA == a[i])
                    count++;
            }
            if (count > a[i])
                return 0;
        }

        return 1;
    }
}