package roosevelt.michigan.com.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of numbers nums, in which exactly two elements appear only
 * once and all the other elements appear exactly twice. Find the two elements
 * that appear only once.
 * 
 * For example:
 * 
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * 
 * Note:
 * 
 * The order of the result is not important. So in the above example, [5, 3] is
 * also correct. Your algorithm should run in linear runtime complexity. Could
 * you implement it using only constant space complexity? a
 * 
 * @author soup
 *
 */
public class SingleNumberIII {

	public int[] singleNumber(int[] nums) {
		Set<Integer> bucket = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (bucket.contains(nums[i])) {
				bucket.remove(nums[i]);
			} else {
				bucket.add(nums[i]);
			}
		}

		int[] result = new int[2];
		Object[] objectArray = bucket.toArray();
		result[0] = (Integer)objectArray[0];
		result[1] = (Integer)objectArray[1];

		return result;
	}

}
