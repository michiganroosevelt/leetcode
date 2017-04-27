package roosevelt.michigan.com.easy;

/**
 * 
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 * 
 * Note: You may assume that nums1 has enough space (size that is greater or
 * equal to m + n) to hold additional elements from nums2. The number of
 * elements initialized in nums1 and nums2 are m and n respectively.
 * 
 * @author soup
 *
 */
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] merged = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;

		while (k < m + n) {
			if (j >= n) {
				merged[k] = nums1[i];
				i++;
				k++;
				continue;
			} else if (i >= m) {
				merged[k] = nums2[j];
				j++;
				k++;
				continue;
			}

			if (nums1[i] < nums2[j]) {
				merged[k] = nums1[i];
				i++;
			} else {
				merged[k] = nums2[j];
				j++;
			}
			k++;
		}

		for (i = 0; i < merged.length; i++) {
			nums1[i] = merged[i];
		}
	}

}
