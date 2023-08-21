package MaharishiCodingChallenges;

public class DecodeArray1 {

	public static void main(String[] args) {
		int[] numbers1 = { 1 };
		int[] numbers2 = { 0, 1 };
		int[] numbers3 = { -1, 0, 1 };
		int[] numbers4 = { 0, 1, 1, 1, 1, 1, 0, 1 };
		int[] numbers5 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
		System.out.println(decodeArray(numbers1));
		System.out.println(decodeArray(numbers2));
		System.out.println(decodeArray(numbers3));
		System.out.println(decodeArray(numbers4));
		System.out.println(decodeArray(numbers5));
	}

	public static int decodeArray(int[] a) {
		int len = a.length;
		int count = 0;
		int number = 0;
		int sum = 0;
		int[] numbers = new int[len];
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == -1) {
				continue;
			}
			if (a[i] == 1) {
				numbers[j++] = number;
				count++;
				number = 0;
			}
			if (a[i] == 0) {
				number++;
			}
		}
		j = 0;
		int exponent = count - 1;
		while (exponent >= 0) {
			sum += numbers[j++] * Math.pow(10, exponent--);
		}
		if (a[0] == -1) {
			return -sum;
		} else {
			return sum;
		}
	}
	
    static int decodeArray1(int[] a) {
        int start = 0, i, count = 0, ans = 0;
        if(a[0] == -1) start = 1;

        for(i = start; i < a.length; i++) {
            if(a[i] == 0) ++count;
            else{
                ans = ans * 10 + count;
                count = 0;
            }
        }

        return start == 0 ? ans : -1 * ans;
    }
}
