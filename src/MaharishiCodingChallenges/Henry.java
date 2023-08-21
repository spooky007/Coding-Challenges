package MaharishiCodingChallenges;

public class Henry {

	public static void main(String[] args) {
		System.out.println(henry(1, 3));
	}

	public static int henry(int i, int j) {
		int count = 0;
		int len = j + 1;
		int[] perfectNumbers = new int[j + 1];
		int k = 0;
		int perfectNum = 2;
		while (count < len) {
			int divisor = 1;
			int sum = 0;
			while (divisor < perfectNum) {
				if (perfectNum % divisor == 0) {
					sum += divisor;
				}
				divisor++;
			}
			if (sum == perfectNum) {
				perfectNumbers[k++] = perfectNum;
				count++;
			}
			perfectNum++;
		}
		return perfectNumbers[i - 1] + perfectNumbers[j - 1];
	}
	
	static int henry2(int i, int j){
		int henry = 0;
		int max = Integer.MAX_VALUE;
		int perfectCount = 0;
		for(int number=1; number <= max; number++){
			int sum = 0;
			for(int divider = 1; divider < number; divider++){
				if(number % divider == 0){
					sum += divider;
				}
			}
			if(sum == number){
				perfectCount++;
				if(perfectCount == i){
					henry += sum;
				}else if(perfectCount == j){
					henry += sum;
					break;
				}
			}
		}
		return henry;
	}
}
