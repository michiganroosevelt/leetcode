package roosevelt.michigan.com.mp.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;
import roosevelt.michigan.com.util.ListNodeUtil;

public class PalindromeLinkedListTest {

	private PalindromeLinkedList solution;

	@Before
	public void setup() {
		solution = new PalindromeLinkedList();
	}

	@Test
	public void testPalindromeLinkedListTrue() {
		ListNode root = ListNodeUtil.build(new Integer[]{1,2,2,1});
		boolean result = solution.isPalindrome(root);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPalindromeLinkedListFalse() {
		ListNode root = ListNodeUtil.build(new Integer[]{1,2,2,3});
		boolean result = solution.isPalindrome(root);

		Assert.assertEquals(false, result);
	}

	@Test
	public void testPalindromeLinkedListTrueOdd() {
		ListNode root = ListNodeUtil.build(new Integer[]{1,2,1});
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
