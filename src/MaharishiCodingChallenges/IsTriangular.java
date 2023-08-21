package MaharishiCodingChallenges;

public class IsTriangular {

	public static void main(String[] args) {
		System.out.println(isTriangular(1));
		System.out.println(isTriangular(3));
		System.out.println(isTriangular(6));
		System.out.println(isTriangular(10));
		System.out.println(isTriangular(5));
		System.out.println(isTriangular(11));
		System.out.println(isTriangular(0));
	}
	
	public static int isTriangular(int n) {
		if(n == 0) {
			return 0;
		}
		int sum = 0;
		int j = 1;
		while (sum < n) {
			sum += j++;
		}
		if (sum == n) {
			return 1;
		} else {
			return 0;
		}
	}
}
