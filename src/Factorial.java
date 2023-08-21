
public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(10));
		System.out.println(factorial(4));
		System.out.println(factorial(2));
		System.out.println(factorial(0));
	}

	public static int factorial(int n) {
		int factorial = n;
		if (factorial == 0 || factorial == 1) {
			return 1;
		}
		factorial = factorial * factorial(n - 1);
		return factorial;
	}

}
