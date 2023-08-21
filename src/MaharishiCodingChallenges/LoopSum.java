package MaharishiCodingChallenges;

public class LoopSum {

	public static void main(String[] args) {
		System.out.println(loopSum(new int[] { 1, 2, 3 }, 2));
		System.out.println(loopSum(new int[] { -1, 2, -1 }, 7));
		System.out.println(loopSum(new int[] { 1, 4, 5, 6 }, 4));
		System.out.println(loopSum(new int[] { 3 }, 10));
	}

	public static int loopSum(int[] a, int n) {
		int i = 0;
		int len = a.length;
		int count = 0;
		int sum = 0;
		while (count < n) {
			sum += a[i];
			count++;
			if (i == len - 1) {
				i = 0;
			} else {
				i++;
			}
		}
		return sum;
	}
	
    static int loopSum1(int[] a, int n) {
        int sum = 0;

        for (int i = 0, index = 0; i < a.length && index < n; i++, index++) {
            sum += a[i];
            if (i == a.length - 1 && index != n - 1)
                i = -1;
        }
        return sum;
    }
}
