package roosevelt.michigan.com.easy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

	public int minMoves(int[] nums) {
		int moves = 0;

		while (true) {
			Arrays.sort(nums);

			if (nums[0] == nums[nums.length - 1]) {
				return moves;
			}

			int highest = nums[nums.length - 1];
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > highest) {
					nums[i] = nums[i] - 1;
				} else {
					nums[i] = nums[i] + 1;
				}
			}

			moves++;
		}
	}
}
