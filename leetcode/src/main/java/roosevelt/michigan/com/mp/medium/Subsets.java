package roosevelt.michigan.com.mp.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a set of distinct integers, nums, return all possible subsets.
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * For example, If nums = [1,2,3], a solution is:
 * 
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 * 
 * @author soup
 *
 */
public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			subsets.addAll(generateAllSubsets(nums, i + 1));
		}

		subsets.add(new ArrayList<Integer>());
		return subsets;
	}

	private List<List<Integer>> generateAllSubsets(int[] nums, int fillCount) {
		Map<Integer, Boolean> openSpots = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 <= fillCount) {
				openSpots.put(i, true);
			} else {
				openSpots.put(i, false);
			}
		}

		boolean isDone = false;
		List<List<Integer>> subsets = new ArrayList<>();
		while (!isDone) {
			subsets.add(generateSubsets(nums, openSpots));
			isDone = moveOpenSpots(openSpots, nums.length, fillCount);
		}

		return subsets;
	}

	private List<Integer> generateSubsets(int[] nums, Map<Integer, Boolean> openSpots) {
		List<Integer> subset = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (openSpots.get(i)) {
				subset.add(nums[i]);
			}
		}
		return subset;
	}

	private boolean moveOpenSpots(Map<Integer, Boolean> openspots, int length, int fillCount) {
		int index = openspots.size() - 1;
		if( fillCount == 2 ) {
			System.out.println("ok");
		}

		boolean foundTrue = false;
		while (true) {
			if (index <= 0) {
				return true;
			}
			
			if( openspots.get(index) ) {
				foundTrue = true;
			}

			if (!openspots.get(index) && openspots.get(index - 1)) {
				openspots.put(index, true);
				openspots.put(index - 1, false);
				return false;
			}

			index--;
		}
	}

}
