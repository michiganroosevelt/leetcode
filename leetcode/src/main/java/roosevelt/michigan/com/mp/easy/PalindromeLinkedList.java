package roosevelt.michigan.com.mp.easy;

import java.util.ArrayList;
import java.util.List;

import roosevelt.michigan.com.common.ListNode;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Follow up: Could you do it in O(n) time and O(1) space?
 * 
 * @author soup
 *
 */
public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		ListNode itr = head;
		List<Integer> copy = new ArrayList<>();
		while (itr != null) {
			copy.add(itr.val);
			itr = itr.next;
		}

		int low = 0;
		int high = copy.size() - 1;
		while (low < high) {
			if (copy.get(low).intValue() != copy.get(high).intValue()) {
				return false;
			}
			low++;
			high--;
		}

		return true;
	}

}
