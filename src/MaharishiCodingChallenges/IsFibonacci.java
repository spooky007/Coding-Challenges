package MaharishiCodingChallenges;

public class IsFibonacci {

	public static void main(String[] args) {
		System.out.println(isFibonacci(13));
		System.out.println(isFibonacci(27));
		System.out.println(isFibonacci(33));
		System.out.println(isFibonacci(34));
		System.out.println(isFibonacci(5));
	}
	
	public static int isFibonacci(int n) {
		int temp1 = 1;
		int temp2 = 1;
		int Fibonacci = 0;
		while (Fibonacci < n) {
			Fibonacci = temp1 + temp2;
			temp1 = temp2;
			temp2 = Fibonacci;
		}
		if (Fibonacci == n) {
			return 1;
		} else {
			return 0;
		}
 	}
}
