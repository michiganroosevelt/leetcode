package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				count++;
				continue;
			}

			nums[i - count] = nums[i];
		}

		return nums.length - count;
	}

}
