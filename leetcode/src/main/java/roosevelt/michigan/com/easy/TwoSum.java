package roosevelt.michigan.com.easy;

import java.util.Map;
import java.util.HashMap;

/**
 * 
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * 
 * @author soup
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> valueMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int need = target - nums[i];
			if (valueMap.containsKey(need)) {
				return new int[] { valueMap.get(need), i };
			} else {
				valueMap.put(nums[i], i);
			}
		}

		return null;
	}

}
