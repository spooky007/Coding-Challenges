package MaharishiCodingChallenges;

import java.util.Arrays;

public class ClusterCompression {

	public static void main(String[] args) {
		int[] numbers1 = { 3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4 };
		int[] numbers2 = { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 };
		int[] numbers3 = { 18 };
		int[] numbers4 = { 1, 2 };
		int[] numbers5 = { -5, -5, -5, -5, -5 };
		int[] numbers6 = { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1 };
		int[] numbers7 = { 8, 8, 6, 6, -2, -2, -2 };
		int[] numbers8 = {};
		System.out.println(Arrays.toString(clusterCompression(numbers7)));
	}
	
	public static int[] clusterCompression(int[] a) {
		int len = a.length;
		int count = 0;
		int[] cluster = new int[len];
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] != temp) {
				cluster[count++] = a[i];
				temp = a[i];
			} else {
				continue;
			}
		}
		int[] clusterCompression = new int[count];
		for (int i = 0; i < count; i++) {
			clusterCompression[i] = cluster[i];
		}
		return clusterCompression;
	}
}
