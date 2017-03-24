package roosevelt.michigan.com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementOne {

	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] result = new int[findNums.length];
		int[] numsCopy = new int[nums.length];
		System.arraycopy( nums, 0, numsCopy, 0, nums.length );

		Map<Integer, Integer> subset = new HashMap<>();
		Map<Integer, Integer> set = new HashMap<>();

		for (int i = 0; i < findNums.length; i++) {
			subset.put(findNums[i], i);
			result[i] = -1;
		}

		for (int i = 0; i < nums.length; i++) {
			set.put(nums[i], i);
		}

		Arrays.sort(nums);
		for( int i = nums.length-1; i > 0; i--) {
			int nextLowest = nums[i-1];
			if( subset.containsKey(nextLowest)) {
				int setIndex = set.get(nums[i]);
				int findNumsIndex = subset.get(nextLowest);
				if( setIndex > findNumsIndex ) {
					result[subset.get(nextLowest)] = numsCopy[i];
				}
			}
		}


		return result;
	}
}
