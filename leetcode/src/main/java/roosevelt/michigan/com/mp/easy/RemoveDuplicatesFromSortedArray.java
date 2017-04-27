package roosevelt.michigan.com.mp.easy;

/**
 * 
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the new
 * length.
 * 
 * @author soup
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return 0;
		}

		if (nums.length == 1) {
			return 1;
		}

		int length = 1;
		for (int i = 0; i < nums.length;) {
			int nextIndex = getNextIndexOfDifferentNumber(i, nums);
			if (nextIndex == -1) {
				break;
			}

			nums[length] = nums[nextIndex];
			i = nextIndex;
			length++;
		}

		return length;
	}

	public int getNextIndexOfDifferentNumber(int index, int[] nums) {
		int current = nums[index];
		index++;

		while (index < nums.length) {
			if (current != nums[index]) {
				return index;
			}
			index++;
		}

		return -1;
	}

}
