import java.util.Arrays;

/**
 * 
 *  program for array left rotation by d positions
 *  
 *  
 * @author Eric
 */
public class LeftRotation {
	
	public static void main(String[] args) {
		int[] ages = {23, 24, 25, 26, 27, 28, 29, 30, 31};
		
		;
//		System.out.println(Arrays.toString(leftRotation(ages, 5)));
		System.out.println(Arrays.toString(rightRotation(ages, 3)));
		
	}
	
	public static int[] leftRotation(int[] inputArray, int d) {
		if ( inputArray.length == 1 || d == 0) {
			return inputArray;
		}
		int len = inputArray.length;
		int[] numbers = new int[len];
		int firstHalfLength = len - d; 
		for (int i = 0; i < firstHalfLength; i++) {
			numbers[i] = inputArray[i + d];
		}
		for( int i = firstHalfLength; i < len; i++) {
			numbers[i] = inputArray[i - firstHalfLength];
		}
		return numbers;
	}
	
	public static int[] rightRotation(int[] inputArray, int d) {
		if ( inputArray.length == 1 || d == 0) {
			return inputArray;
		}
		int len = inputArray.length;
		int[] numbers = new int[len];
		int startPos = len - d;
		for (int i = 0; i < d; i++) {
			numbers[i] = inputArray[startPos++];
		}
		int k = 0;
		for( int i = d; i < len; i++) {
			numbers[i] = inputArray[k++];
		}
		return numbers;
	}

}
