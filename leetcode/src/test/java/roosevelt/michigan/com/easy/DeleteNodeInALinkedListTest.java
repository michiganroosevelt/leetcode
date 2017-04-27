package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;

public class DeleteNodeInALinkedListTest {
	
	private DeleteNodeInALinkedList solution;

	@Before
	public void setup() {
		solution = new DeleteNodeInALinkedList();
	}

	@Test
	public void testDeleteNodeInALinkedListExample() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		solution.deleteNode(node3);

		Assert.assertEquals(2, node1.next.val);
		Assert.assertEquals(4, node2.next.val);
	}

	@Test
	public void testDeleteNodeInALinkedListFirstNode() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		solution.deleteNode(node1);

		Assert.assertEquals(2, node1.val);
		Assert.assertEquals(3, node2.val);
		Assert.assertEquals(4, node3.val);
	}


}
