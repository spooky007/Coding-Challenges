public class ReverseInteger {

	public static void main(String[] args) {
		
		System.out.println(reverseInteger(5674));

	}

	public static int reverseInteger(int number) {
		int reverse = 0;
		while (number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		return reverse;
	}
}