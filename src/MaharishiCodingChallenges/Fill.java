package MaharishiCodingChallenges;

import java.util.Arrays;

public class Fill {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fill(new int[] { 1, 2, 3, 5, 9, 12, -2, -1 }, 3, 10)));
		System.out.println(Arrays.toString(fill(new int[] { 4, 2, -3, 12 }, 1, 5)));
		System.out.println(Arrays.toString(fill(new int[] { 2, 6, 9, 0, -3 }, 0, 4)));

	}

	public static int[] fill(int[] arr, int k, int n) {
		if (k <= 0 || n <= 0) {
			return null;
		}
		int len = arr.length;
		int[] arr1 = new int[n];
		int i = 0;
		int j = 0;
		while (j < k) {
			arr1[j++] = arr[i];
			i++;
		}
		while (j < n) {
			if (i == k) {
				i = 0;
			}
			arr1[j++] = arr[i];
			i++;
		}
		return arr1;
	}
}
