
public class PrintDistinctElements {

	public static void main(String[] args) {
		int[] numbers = {12, 10, 9, 45, 2, 10, 10, 45};
		printDistinctElements(numbers);
		
	}
	
	public static void printDistinctElements(int[] inputArray) {
		int len = inputArray.length;
		int[] outputArray = new int[len];
		int k = 0;
		int counter = 0;
		boolean isPresent = false;
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if(inputArray[i] == outputArray[j]) {
					isPresent = true;
				}
			}
			if(isPresent == false) {
				outputArray[k++] = inputArray[i];
				counter++;
			}
			isPresent = false;
		}
		for (int p = 0; p < counter; p++) {
			System.out.println(outputArray[p]);
		}
	}
}
