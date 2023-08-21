
public class LargestThreeElements {

	public static void main(String[] args) {

		int[] numbers = { 10, 4, 3, 50, 23, 90 };
		int[] numbers2 = { 12, 13, 1, 10, 34, 34, 34, 1 };
		largestThreeElements(numbers2);

	}

	public static void largestThreeElements(int[] inputArray) {
		int len = inputArray.length;
		int max, mid, min;
		max = mid = min = 0;
		int i = 0;
		while (i < len) {
			if (inputArray[i] > max) {
				min = mid;
				mid = max;
				max = inputArray[i];
				
			} else if (inputArray[i] > mid & max != inputArray[i] ) {
				min = mid; 
				mid = inputArray[i];
			} else if (inputArray[i] > min & mid != inputArray[i]) {
				min = inputArray[i];
			}
			i++;
		}
		i = 0;

		int[] newArray = { max, mid, min };
		while (i < 3) {
			System.out.println(newArray[i]);
			i++;
		}
	}

}
