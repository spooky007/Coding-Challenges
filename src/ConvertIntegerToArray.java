import java.util.Arrays;

public class ConvertIntegerToArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(convertIntegerToArray(45670)));
	}

	public static int[] convertIntegerToArray(int n) {
		int remainder = 0;
		int quotient = n;
		int count = 0;
		while (quotient != 0) {
			quotient /= 10;
			count++;
		}
		quotient = n;
		int[] intArray = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			remainder = quotient % 10;
			quotient /= 10;
			intArray[i] = remainder;
		}
		return intArray;
	}
}
