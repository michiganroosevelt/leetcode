package roosevelt.michigan.com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given scores of N athletes, find their relative ranks and the people with the
 * top three highest scores, who will be awarded medals: "Gold Medal", "Silver
 * Medal" and "Bronze Medal".
 * 
 * Example 1:
 * 
 * Input: [5, 4, 3, 2, 1] Output: ["Gold Medal", "Silver Medal", "Bronze Medal",
 * "4", "5"] Explanation: The first three athletes got the top three highest
 * scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". For the
 * left two athletes, you just need to output their relative ranks according to
 * their scores.
 * 
 * @author soup
 *
 */
public class RelativeRanks {

	public static String GOLD = "Gold Medal";

	public static String SILVER = "Silver Medal";

	public static String BRONZE = "Bronze Medal";

	public String[] findRelativeRanks(int[] nums) {
		Map<Integer, Integer> rankIndex = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			rankIndex.put(nums[i], i);
		}

		String[] result = new String[nums.length];
		Arrays.sort(nums);
		int place = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			int index = rankIndex.get(nums[i]);

			if (place == 1) {
				result[index] = GOLD;
			} else if (place == 2) {
				result[index] = SILVER;
			} else if (place == 3) {
				result[index] = BRONZE;
			} else {
				result[index] = Integer.toString(place);
			}

			place++;
		}

		return result;
	}
}
