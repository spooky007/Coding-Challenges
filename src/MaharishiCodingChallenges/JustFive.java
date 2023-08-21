package MaharishiCodingChallenges;

public class JustFive {
	static int count = 0;
	
	public JustFive() {
		if (count < 6) {
			count++;
			System.out.println(count + " instances have been created");
		} else {
			System.out.println("You have reached the max num of instances which is 5");
		}
	}
	
	public static void main(String[] args) {
		JustFive instance1 = new JustFive();
		JustFive instance2 = new JustFive();
		JustFive instance3 = new JustFive();
		JustFive instance4 = new JustFive();
		JustFive instance5 = new JustFive();
		JustFive instance6 = new JustFive();
	}
}
