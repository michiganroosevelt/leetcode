package roosevelt.michigan.com.easy;

/**
 * 
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * 
 * Note: Try to come up as many solutions as you can, there are at least 3
 * different ways to solve this problem.
 * 
 * [show hint]
 * 
 * Related problem: Reverse Words in a String II
 * 
 * 
 * @author soup
 *
 */
public class RotateArray {

	public void rotate(int[] nums, int k) {
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int offset = i - k;
			while (offset < 0) {
				offset += nums.length;
			}

			result[i] = nums[offset];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = result[i];
		}
	}

}
