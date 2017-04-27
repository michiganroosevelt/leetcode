package roosevelt.michigan.com.easy;

import java.util.Stack;

import roosevelt.michigan.com.common.ListNode;

/**
 * Reverse a singly linked list.
 * 
 * @author soup
 *
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
    	if( head == null || head.next == null ) {
    		return head;
    	}
    	Stack<ListNode> nodes = new Stack<>();
    	while( head != null ) {
    		nodes.add(head);
    		head = head.next;
    	}
    	
    	ListNode result = nodes.pop();
    	ListNode settingNode = result;
    	while( nodes.size() > 0 ) {
    		settingNode.next = nodes.pop();
    		settingNode = settingNode.next;
    	}
    	settingNode.next = null;
        
    	return result;
    }

}
