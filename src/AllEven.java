
public class AllEven {

	public static void main(String[] args) {
		
	}
	
	public static int allEven(int[] a, int len) {
		int AllEven = 1;
		len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 != 0) {
				return 0;
			}
		}
		return AllEven;
	}

}
