
package roosevelt.michigan.com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author soup
 *
 */
public class LongestHarmoniousSubsequence {

	public int findLHS(int[] nums) {
		Arrays.sort(nums);

		Map<Integer, Integer> count = new HashMap<>();
		int max = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			if (count.containsKey(nums[i])) {
				count.put(nums[i], count.get(nums[i]) + 1);
			} else {
				count.put(nums[i], 1);
			}

			if (nums[i + 1] > nums[i]) {
				if (count.containsKey(nums[i] - 1)) {
					max = Math.max(max, count.get(nums[i]) + count.get(nums[i - 1]));
				} else {
					max = Math.max(max, count.get(nums[i - 1]));
				}
			}

		}
		if (count.containsKey(nums[nums.length - 2])) {
			max = Math.max(max, count.get(nums[nums.length - 1]) + count.get(nums[nums.length - 2]));
		} else if( count.containsKey(nums[nums.length - 1])){
			max = Math.max(max, 1);
		}

		return max;
	}

}
