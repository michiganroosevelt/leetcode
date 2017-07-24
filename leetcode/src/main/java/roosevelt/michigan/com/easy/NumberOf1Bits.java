package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class NumberOf1Bits {

	public int hammingWeight(int n) {
		int weight = 0;

		while (n != 0) {
			weight += n & 1;
			n = n >>> 1;
		}

		return weight;
	}
}
