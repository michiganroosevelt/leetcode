package roosevelt.michigan.com.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements
 * appear twice and others appear once.
 * 
 * Find all the elements that appear twice in this array.
 * 
 * Could you do it without extra space and in O(n) runtime?
 * 
 * Example:
 * 
 * Input: [4,3,2,7,8,2,3,1]
 * 
 * Output: [2,3]
 * 
 * 
 * @author soup
 *
 */
public class FindAllDuplicatesInAnArray {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (!duplicates.add(nums[i])) {
				result.add(nums[i]);
			}
		}

		return result;
	}

}
