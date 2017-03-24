package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * @author soup
 *
 */
public class NumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		Map<Integer, Integer> allNumbers = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			allNumbers.put(i+1, i+1);
		}

		for (int i = 0; i < nums.length; i++) {
			if (allNumbers.containsKey(nums[i])) {
				allNumbers.remove(nums[i]);
			}
		}

		List<Integer> result = new ArrayList<>();
		for (Integer missingNumber : allNumbers.values()) {
			result.add(missingNumber);
		}

		return result;
	}
}
