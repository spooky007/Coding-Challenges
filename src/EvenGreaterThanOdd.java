import java.util.Arrays;

public class EvenGreaterThanOdd {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println(Arrays.toString(assign1(numbers)));
//		System.out.println(Arrays.toString(numbers));
	}

	public static int[] assign(int[] inputArray) {
		// sort the array
		Arrays.sort(inputArray);
		
		int arraySize = inputArray.length;
		int[] ans = new int[arraySize];
		int even = 0;
		int odd = arraySize - 1;
		for (int i = 0; i < arraySize; i++) {
			if ((i + 1) % 2 == 0) {
				// assign even indexes with maximum numbers
				ans[i] = inputArray[odd--]; 
			} else {
				// assign odd indexes with maximum numbers
				ans[i] = inputArray[even++];
				
			}
		}
		return ans;
	}
	
	public static int[] assign1(int[] inputArray) {
		// sort the array
		Arrays.sort(inputArray);
		
		int arraySize = inputArray.length;
		int[] ans = new int[arraySize];
		int even = 0;
		int odd = arraySize - 1;
		int flag = 0;
		for (int i = 0; i < arraySize; i++) {
			if (flag == 1) {
				// assign even indexes with maximum numbers
				ans[i] = inputArray[odd--];
				flag = 0;
			} else {
				// assign odd indexes with maximum numbers
				ans[i] = inputArray[even++];
				flag = 1;
				
			}
		}
		return ans;
	}
}
