package MaharishiCodingChallenges;

import java.util.Arrays;

public class Solve10 {

	public static void main(String[] args) {
//		System.out.println(factorial(10));
		System.out.println(Arrays.toString(solve10()));
//		System.out.println(Arrays.toString(solve10a()));
	}

	public static int[] solve10() {
		int[] xAndY = new int[2];
		int fact10 = factorial(10);
		for (int x = 1; x < 10; x++) {
			int factx = factorial(x);
			for (int y = 1; y < 10; y++) {
				int facty = factorial(y);
				if (factx + facty == fact10) {
					xAndY[0] = x;
					xAndY[1] = y;
					return xAndY;
				}
			}
		}
		return xAndY;
	}
	
	static int[] solve10a(){
		int solve10[] = new int[2];
		int tenFactorial = 1;
		int x = 0;
		int y = 0;
		boolean factorialFound = false;
		for(int i = 1; i <= 10; i++){
			tenFactorial = tenFactorial * i;
		}
		for(x = 0; x < 10; x++){
			int xFactorial = 1;
			if(x > 0){
				for(int i = 1; i <= x; i++){
					xFactorial = xFactorial * i;
				}
			}
			for(y = 0; y < 10; y++){
				int yFactorial = 1;
				if(y > 0){	
					for(int j = 1; j <= y; j++){
						yFactorial = yFactorial * j;
					}
				}
				if(xFactorial + yFactorial == tenFactorial){
					factorialFound = true;
					break;
				}
			}
			if(factorialFound){
				break;
			}
		}
		if(x == 10 && y == 10){
			//Not Found
			x = 0;
			y = 0;
		}
		solve10[0] = x;
		solve10[1] = y;
		return solve10;
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int fact = n * factorial(n - 1);
		return fact;
	}
}
