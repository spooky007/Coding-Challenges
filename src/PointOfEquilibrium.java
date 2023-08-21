
public class PointOfEquilibrium {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		int[] digits = { 3, 4, 5, 10};
		System.out.println(POE(digits));
	}

	public static int POE(int[] numbers) {
		int len = numbers.length;

		int poe = 1;


		while (poe < len - 1) {
			int left = 0;
			int right = 0;
			int i = 0;
			int j = poe + 1;
			while (i < poe) {
				left += numbers[i];
				i++;
			}
			while (j < len) {
				right += numbers[j];
				j++;
			}
			if (left == right) {
				break;
			} else {
				poe++;
			}
			if (left != right && poe == (len - 1)) {
				return -1;
			} 
		}
		return poe;
	}
}
