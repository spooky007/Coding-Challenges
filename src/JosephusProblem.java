//Given the total number of persons n and a number k which indicates that k-1 persons
//are skipped and kth person is killed in circle in a fixed direction. After each operation,
//the count will start from k+1th person. The task is to choose the safe place in the circle
//so that when you perform these operations starting from 1st place in the circle, you are 
//the last one remaining and survive.
//Input:
//n = 3 k = 2
//Output: 3
//Explanation: There are 3 persons so 
//skipping 1 person i.e 1st person 2nd 
//person will be killed. Thus the safe 
//position is 3.

public class JosephusProblem {
	
	public static void main(String[] args) {
		System.out.print(josephus(8, 2));
	}
	
	public static int josephus(int n, int k) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr[k];
	}
}