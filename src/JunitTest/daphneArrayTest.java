package JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import MaharishiCodingChallenges.DaphneArray;

class daphneArrayTest {

	@Test
	void test() {
		DaphneArray daphne = new DaphneArray();
		int output1 = daphne.isDaphne(new int[] { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 });
		int output2 = daphne.isDaphne(new int[] { 2, 4, 6, 8, 6 });
		int output3 = daphne.isDaphne(new int[] { 2, 8, 7, 10, -4, 6 });
		assertEquals(1, output1);
		assertEquals(0, output2);
		assertEquals(0, output3);
	}

}
