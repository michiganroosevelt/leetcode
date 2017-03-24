package roosevelt.michigan.com.easy;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * 
 * Note:
 * 
 * You must do this in-place without making a copy of the array. Minimize the
 * total number of operations.
 * 
 * @author soup
 *
 */
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		if (nums == null) {
			return;
		}

		if (nums.length == 1) {
			return;
		}

		int startIndex = 0;
		int startNumber = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = startNumber;
				nums[startIndex] = temp;
				i = startIndex;
				if( nums.length > i+1) {
					startIndex = i + 1;
					startNumber = nums[i + 1];
				}
				continue;
			}
		}
	}
}
