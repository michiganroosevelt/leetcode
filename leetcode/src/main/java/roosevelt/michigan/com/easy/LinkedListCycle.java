package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

import roosevelt.michigan.com.common.ListNode;

/**
 * 
 * @author soup
 *
 */
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		Map<Integer, ListNode> nodes = new HashMap<>();
		while (head != null) {
			if (nodes.containsKey(head.val)) {
				ListNode existingNode = nodes.get(head.val);
				if (head.next != null && existingNode.next != null) {
					if (head.next.val == existingNode.next.val) {
						return true;
					}
				}
			}
			nodes.put(head.val, head);
			head = head.next;
		}

		return false;
	}

}
