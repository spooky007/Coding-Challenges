package MaharishiCodingChallenges;

public class AreAnagrams {

	public static void main(String[] args) {
		System.out.println(areAnagrams(new int[] {'s', 'i', 't'}, new int[]{'i', 't', 's'}));
		System.out.println(areAnagrams(new int[] {'s', 'i', 't'}, new int[]{'i', 'd', 's'}));
		System.out.println(areAnagrams(new int[] {'b', 'i', 'g'}, new int[]{'b', 'i', 't'}));
		System.out.println(areAnagrams(new int[] {'b', 'o', 'g'}, new int[]{'i', 'o', 'o'}));
		System.out.println(areAnagrams(new int[] {}, new int[]{}));
		System.out.println(areAnagrams(new int[] {'b', 'i', 'g'}, new int[]{'b', 'i', 'g'}));
	}
	
	public static int areAnagrams(int[] a, int[] b) {
		int lenA = a.length;
		int lenB = b.length;
		int areAnagrams = 1;
		if (lenA != lenB) {
			return areAnagrams = 0;
		}
		for (int i = 0; i < lenA; i++) {
			int found = 0;
			for(int j = 0; j < lenB; j++) {
				if(a[i] == b[j]) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				return 0;
			}
		}
		return areAnagrams;
	}
}
