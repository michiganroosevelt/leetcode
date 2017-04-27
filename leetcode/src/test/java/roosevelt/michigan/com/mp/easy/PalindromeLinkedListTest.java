package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;

public class PalindromeLinkedListTest {

	private PalindromeLinkedList solution;

	@Before
	public void setup() {
		solution = new PalindromeLinkedList();
	}

	@Test
	public void testPalindromeLinkedListTrue() {
		ListNode root = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(1);

		root.next = node1;
		node1.next = node2;
		node2.next = node3;

		boolean result = solution.isPalindrome(root);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPalindromeLinkedListFalse() {
		ListNode root = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);

		root.next = node1;
		node1.next = node2;
		node2.next = node3;

		boolean result = solution.isPalindrome(root);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testPalindromeLinkedListTrueOdd() {
		ListNode root = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(1);

		root.next = node1;
		node1.next = node2;

		boolean result = solution.isPalindrome(root);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPalindromeLinkedListTrueOne() {
		ListNode root = new ListNode(1);

		boolean result = solution.isPalindrome(root);
		Assert.assertEquals(true, result);
	}
}
