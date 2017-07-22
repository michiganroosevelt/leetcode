package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] noteChars = new int[26];
		int[] magazineChars = new int[26];

		for (int i = 0; i < magazine.length(); i++) {
			int value = magazine.charAt(i) - (int) 'a';
			magazineChars[value]++;
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			int value = ransomNote.charAt(i) - (int) 'a';
			noteChars[value]++;
		}

		for (int i = 0; i < noteChars.length; i++) {
			if (noteChars[i] > magazineChars[i]) {
				return false;
			}
		}

		return true;
	}

}
