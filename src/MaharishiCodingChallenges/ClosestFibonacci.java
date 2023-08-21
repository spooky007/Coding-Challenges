package MaharishiCodingChallenges;

public class ClosestFibonacci {

	public static void main(String[] args) {
		System.out.println(closestFibonacci(13));
		System.out.println(closestFibonacci(33));
		System.out.println(closestFibonacci(34));
		System.out.println(closestFibonacci(0));
		System.out.println(closestFibonacci(2));
	}
	
	public static int closestFibonacci(int n) {
		if (n < 1) {
			return 0;
		}
		int temp1 = 1;
		int temp2 = 1;
		int next = 0;
		while (next < n) {
			next = temp1 + temp2;
			temp1 = temp2;
			temp2 = next;
		}
		if (next == n) {
			return n;
		} else {
			return temp1;
		}
	}
}
