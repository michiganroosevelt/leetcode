package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * 
 * Note:
 * 
 * Each element in the result should appear as many times as it shows in both
 * arrays. The result can be in any order.
 * 
 * Follow up:
 * 
 * What if the given array is already sorted? How would you optimize your
 * algorithm? What if nums1's size is small compared to nums2's size? Which
 * algorithm is better? What if elements of nums2 are stored on disk, and the
 * memory is limited such that you cannot load all elements into the memory at
 * once?
 * 
 * @author soup
 *
 */
public class IntersectionOfTwoArraysII {

	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map1 = buildMap(nums1);
		Map<Integer, Integer> map2 = buildMap(nums2);

		List<Integer> result = new ArrayList<>();
		for (Integer value : map1.keySet()) {
			if (!map2.containsKey(value)) {
				continue;
			}

			int number = Math.min(map1.get(value), map2.get(value));
			for (int i = 0; i < number; i++) {
				result.add(value);
			}
		}

		int[] finalResult = new int[result.size()];
		for (int i = 0; i < finalResult.length; i++) {
			finalResult[i] = result.get(i);
		}

		return finalResult;
	}

	public Map<Integer, Integer> buildMap(int[] input) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int value : input) {
			if (result.containsKey(value)) {
				result.put(value, result.get(value) + 1);
			} else {
				result.put(value, 1);
			}
		}

		return result;
	}

}
