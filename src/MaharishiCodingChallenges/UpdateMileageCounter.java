package MaharishiCodingChallenges;

import java.util.Arrays;

public class UpdateMileageCounter {

	public static void main(String[] args) {
		int[] numbers1 = { 8, 9, 9, 5, 0 };                   // miles = 1
		int[] numbers2 = { 8, 9, 9, 5, 0 };                   // miles = 2
		int[] numbers3 = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };    // miles = 1
		int[] numbers4 = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };    // miles = 13
		updateMileageCounter(numbers1, 1);
		updateMileageCounter(numbers2, 2);
		updateMileageCounter(numbers3, 1);
		updateMileageCounter(numbers4, 13);
		System.out.println(Arrays.toString(numbers1));
		System.out.println(Arrays.toString(numbers2));
		System.out.println(Arrays.toString(numbers3));
		System.out.println(Arrays.toString(numbers4));
	}

	public static void updateMileageCounter(int[] a, int miles) {
		int len = a.length;
		int carrier = miles;
		int i = 0;
		while (carrier > 0 && i < len) {
			int subst = (a[i] + carrier) % 10;
			carrier = addMiles(a[i], carrier);
			a[i] = subst;
			i++;
		}
	}

	private static int addMiles(int i, int n) {
		int sum = i + n;
		if (sum < 10) {
			return 0;
		} else {
			return sum / 10;
		}
	}
	
	 static void updateMileageCounter1(int[] a, int miles) {
	        for (int i = 0; i < a.length && miles > 0; i++) {
	            miles = a[i] + miles;
	            if (miles > 9) {
	                int tempMiles = miles % 10;
	                miles /= 10;
	                a[i] = tempMiles;
	            } else {
	                a[i] = miles;
	                miles = 0;
	            }
	        }
	    }
}
