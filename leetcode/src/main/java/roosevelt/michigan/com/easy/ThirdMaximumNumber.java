package roosevelt.michigan.com.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers, return the third maximum number in this
 * array. If it does not exist, return the maximum number. The time complexity
 * must be in O(n).
 * 
 * Example 1:
 * 
 * Input: [3, 2, 1]
 * 
 * Output: 1
 * 
 * Explanation: The third maximum is 1.
 * 
 * Example 2:
 * 
 * Input: [1, 2]
 * 
 * Output: 2
 * 
 * Explanation: The third maximum does not exist, so the maximum (2) is returned
 * instead.
 * 
 * Example 3:
 * 
 * Input: [2, 2, 3, 1]
 * 
 * Output: 1
 * 
 * Explanation: Note that the third maximum here means the third maximum
 * distinct number. Both numbers with value 2 are both considered as second
 * maximum.
 * 
 * @author soup
 *
 */
public class ThirdMaximumNumber {

	public int thirdMax(int[] nums) {
		Integer[] high = new Integer[] { null, null, null };
		int highest = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			if (current > highest) {
				highest = current;
			}

			if( high[2] != null && high[2] == current ) {
				continue;
			}
			if( high[1] != null && high[1] == current ) {
				continue;
			}
			if( high[0] != null && high[0] == current ) {
				continue;
			}
			

			if (high[2] == null || current >= high[2]) {
				high[0] = high[1];
				high[1] = high[2];
				high[2] = current;
			} else if (high[1] == null || current >= high[1]) {
				high[0] = high[1];
				high[1] = current;
			} else if (high[0] == null || current >= high[0]) {
				high[0] = current;
			}
		}

		if (high[0] != null) {
			return high[0];
		} else {
			return highest;
		}
	}

}
