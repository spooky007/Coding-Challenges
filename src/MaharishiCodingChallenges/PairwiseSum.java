package MaharishiCodingChallenges;

import java.util.Arrays;

public class PairwiseSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(pairwiseSum(new int[] { 2, 1, 18, -5 })));
		System.out.println(Arrays.toString(pairwiseSum(new int[] { 2, 1, 18, -5, -5, -15, 0, 0, 1, -1 })));
		System.out.println(Arrays.toString(pairwiseSum(new int[] { 2, 1, 18 })));
		System.out.println(Arrays.toString(pairwiseSum(new int[] {})));
	}

	public static int[] pairwiseSum(int[] a) {
		int len = a.length;
		int[] pairwiseSum = new int[len / 2];
		if (len == 0 || len % 2 == 1) {
			return null;
		}
		int j = 0;
		for (int i = 0; i < len; i += 2) {
			pairwiseSum[j++] = a[i] + a[i + 1];
		}
		return pairwiseSum;
	}
}
