package MaharishiCodingChallenges;

public class IsIsolated {

	public static void main(String[] args) {
		System.out.println(isIsolated(14));
	}
	
	public static int isIsolated(long n) {
		int isIsolated = 1;
		long cube = n * n * n;
		long square = n * n;
		int[] cubeArray = convertIntegerToArray((int) cube);
		int[] squareArray = convertIntegerToArray((int) square);
		int cubeLen = cubeArray.length;
		int squareLen = squareArray.length;
		for (int i = 0; i < squareLen; i++) {
			for (int j = 0; j < cubeLen; j++) {
				if (squareArray[i] == cubeArray[j]) {
					return isIsolated = 0;
				}
			}
		}
		return isIsolated;
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
