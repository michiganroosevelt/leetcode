package roosevelt.michigan.com.medium;

/**
 * 
 * @author soup
 *
 */
public class CountingBits {

	public int[] countBits(int num) {
		if( num == 0 ) {
			return new int[1];
		}

		int[] result = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			if (i == 0) {
				continue;
			}

			int val = i;
			while (val != 0) {
				if ((val & 1) == 1) {
					result[i]++;
				}
				val = val >>> 1;
			}
		}

		return result;
	}

}
