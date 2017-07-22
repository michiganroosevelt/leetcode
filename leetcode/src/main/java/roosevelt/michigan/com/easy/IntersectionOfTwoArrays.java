package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * 
 * Note:
 * 
 * Each element in the result must be unique. The result can be in any order.
 * 
 * @author soup
 *
 */
public class IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length <= 0) {
			return nums1;
		}

		if (nums2 == null || nums2.length <= 0) {
			return nums2;
		}

		Set<Integer> check = new HashSet<>();

		for (int i = 0; i < nums1.length; i++) {
			check.add(nums1[i]);
		}

		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if (check.contains(nums2[i])) {
				temp.add(nums2[i]);
				check.remove(nums2[i]);
			}
		}

		int[] result = new int[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			result[i] = temp.get(i);
		}

		return result;
	}
}
