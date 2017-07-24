package roosevelt.michigan.com.util;

import org.junit.Assert;

import roosevelt.michigan.com.common.ListNode;

public class ListNodeUtil {

	public static ListNode build(Integer[] input) {
		if (input == null || input.length <= 0) {
			return null;
		}

		ListNode root = null;
		ListNode itr = null;

		for (int value : input) {
			ListNode node = new ListNode(value);
			if (root == null) {
				root = node;
			}
			if (itr == null) {
				itr = node;
			} else {
				itr.next = node;
				itr = node;
			}
		}

		return root;
	}

	public static String toString(ListNode input) {
		if (input == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		ListNode itr = input;
		String space = "";
		while (itr != null) {
			sb.append(space + itr.val);
			space = " ";
			itr = itr.next;
		}

		return sb.toString();
	}

	public static void assertEquals(ListNode n1, ListNode n2) {
		while (true) {
			if (n1 == null && n2 == null) {
				return;
			}

			if (n1 == null && n2 != null) {
				Assert.fail("ListNodes aren't equal");
			}

			if (n1 != null && n2 == null) {
				Assert.fail("ListNodes aren't equal");
			}

			Assert.assertEquals(n1.val, n2.val);
			n1 = n1.next;
			n2 = n2.next;
		}
	}

}
