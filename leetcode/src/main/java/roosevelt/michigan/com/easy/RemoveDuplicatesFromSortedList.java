package roosevelt.michigan.com.easy;

import java.util.HashSet;
import java.util.Set;

import roosevelt.michigan.com.common.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3.
 * 
 * @author soup
 *
 */
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		if( head == null ) {
			return head;
		}
		
		Set<Integer> nums = new HashSet<>();
		ListNode node = head.next;
		ListNode previous = head;

		nums.add(head.val);
		while (node != null) {
			if (nums.contains(node.val)) {
				previous.next = null;
				node = node.next;
			} else {
				nums.add(node.val);
				previous.next = node;
				previous = previous.next;
				node = node.next;
			}
		}

		return head;
	}

}
