
public class IsCube {
	
	public static void main(String[] args) {
		System.out.println(isCube(-8));
		System.out.println(isCube(27));
		System.out.println(isCube(-27));
		System.out.println(isCube(-48));
		System.out.println(isCube(48));
		System.out.println(isCube(9));
		System.out.println(isCube(64));
	}
	
	private static int isCube(int n) {
		n = n >= 0 ? n : -n;
		if (n == 0 || n == 1) {
			return 1;
		}
		for (int i = 2; i < n; i++) {
			if (n == i * i * i) {
				return 1;
			}
		}
		return 0;
	}	
	
}
