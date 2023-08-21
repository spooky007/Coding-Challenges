package MaharishiCodingChallenges;

public class IsVesuvian {

	public static void main(String[] args) {
		System.out.println(isVesuvian(50));
		System.out.println(isVesuvian(65));
		System.out.println(isVesuvian(85));
		
		System.out.println(isVesuvian(49));
	}

	public static int isVesuvian(int n) {
		int isVesuvian = 0;
		int i = 0;
		int square = 0;
		int arraySize = 0;
		while (square < n) {
			square = i * i;
			if (square < n) {
				i++;
			} else {
				break;
			}
			arraySize++;
		}
		int[] squares = new int[arraySize];
		i = 0;
		for (int k = 0; k < arraySize; k++) {
			squares[k] = i * i;
			i++;
		}
		int count = 0;
		for (i = 0; i < arraySize; i++) {
			int j = i;
			while (j < arraySize) {
				if (squares[i] + squares[j] == n) {
					count++;
				}
				j++;
			}
		}
		if (count >= 2) {
			return 1;
		} else {
			return 0;
		}

	}
	
	 static int isVesuvian1(int n) {
	        int count = 0;
	        for (int i = 1; (i * i) < n; i++) {
	            int sum1 = i * i;
	            for (int j = 1; (j * j) < n; j++) {
	                int sum2 = j * j;

	                if (sum1 + sum2 == n) {
	                    count++;
	                    break;
	                }
	            }
	            if (count >= 2) return 1;
	        }
	        return 0;
	    }
}
