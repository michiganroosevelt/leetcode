package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * 
 * @author soup
 *
 */
public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Boolean> duplicates = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (duplicates.containsKey(nums[i])) {
				return true;
			}
			duplicates.put(nums[i], true);
		}

		return false;
	}
}
