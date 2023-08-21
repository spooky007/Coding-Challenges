import java.lang.reflect.Array;
import java.util.Random;

public class BubbleSort {

	static Random rand = new Random();
	static int x = 5;
	static int y = 6;

	public static void main(String[] args) {
		int[] numbers = new int[100000];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000000);
		}
		
		System.out.println("Before:");
		printArray(numbers);
		System.out.println();
//		int[] numbers = { 3, 10, 5, 11, 9, 23 };

 		double time1 = System.currentTimeMillis();
 		System.out.println("After:");
 		printArray(sort(numbers));
 		
 		double time2 = System.currentTimeMillis();
 		x = 0;
 		while (x < 61) {
 			System.out.print("=");
 			x++;
 		}
 		System.out.println();
 		System.out.println(time2 - time1);

	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	private static int[] sort(int[] inputArray) {
		boolean swappedSomething = true;
		while (swappedSomething) {
			// verify if any swapped has occured
			swappedSomething = false;
			for (int i = 0; i < inputArray.length - 1; i++) {
				if (inputArray[i] > inputArray[i + 1]) {
					// confirm swap occurs by changing boolean to true
					swappedSomething = true;
					int temp = inputArray[i];
					inputArray[i] = inputArray[i + 1];
					inputArray[i + 1] = temp;
				}
			}
		}
		return inputArray;
	}
}