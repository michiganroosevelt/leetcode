package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author soup
 *
 */
public class MajorityElement {

	public int majorityElement(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		if (nums.length == 1) {
			return nums[0];
		}

		int limit = nums.length / 2;
		Map<Integer, Integer> counter = new HashMap<>();

		for (int value : nums) {

			if (!counter.containsKey(value)) {
				counter.put(value, new Integer(1));
			} else {
				counter.put(value, counter.get(value).intValue() + 1);
			}

			if (counter.get(value).intValue() > limit) {
				return value;
			}
		}

		return 0;
	}
}
