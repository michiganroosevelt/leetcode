package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * @author soup
 *
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		Map<Integer, Integer> holder = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (holder.containsKey(nums[i])) {
				holder.remove(nums[i]);
			} else {
				holder.put(nums[i], nums[i]);
			}
		}
		
		for( Integer found :holder.keySet() ) {
			return found;
		}

		return -1;
	}
}
