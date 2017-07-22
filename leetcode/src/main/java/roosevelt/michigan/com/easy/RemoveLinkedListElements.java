package roosevelt.michigan.com.easy;

import roosevelt.michigan.com.common.ListNode;

/**
 * 
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6 Return: 1 --> 2
 * --> 3 --> 4 --> 5
 * 
 * @author soup
 *
 */
public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		ListNode result = findNext(head, val);
		ListNode itr = result;

		while (itr != null) {
			ListNode next = findNext(itr.next, val);
			itr.next = next;
			itr = next;
		}

		return result;
	}

	private ListNode findNext(ListNode head, int val) {
		if (head == null) {
			return null;
		}

		while (head != null) {
			if (head.val != val) {
				return head;
			}

			head = head.next;
		}

		return null;
	}

}
