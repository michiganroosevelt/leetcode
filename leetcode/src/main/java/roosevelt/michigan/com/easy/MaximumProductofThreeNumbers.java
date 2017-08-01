
package roosevelt.michigan.com.easy;

import java.util.Arrays;

/**
 * 
 * @author soup
 *
 */
public class MaximumProductofThreeNumbers {

	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int result = 0;

		int first = nums[0];
		int second = nums[1];
		int last = nums[nums.length - 1];
		int secondLast = nums[nums.length - 2];
		int thirdLast = nums[nums.length - 3];

		result = thirdLast * secondLast * last;
		result = first * second * last > result ? first * second * last : result;

		return result;
	}

}
