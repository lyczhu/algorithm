package algo.leetcode.simple;

import algo.leetcode.ListNode;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListTest {

	@Test
	void mergeTwoLists() {
		int[] nums1 = {1, 2, 4};
		int[] nums2 = {1, 3, 4};
		ListNode node1 = genNode(nums1);
		ListNode node2 = genNode(nums2);
		MergeTwoSortedList mtsl = new MergeTwoSortedList();


	}

	@Test
	void mergeTwoLists2() {
		int[] nums1 = {1, 2, 4};
		int[] nums2 = {1, 3, 4};
		ListNode node1 = genNode(nums1);
		ListNode node2 = genNode(nums2);
		MergeTwoSortedList mtsl = new MergeTwoSortedList();
		System.out.println(mtsl.mergeTwoLists2(node1, node2));
	}

	private ListNode genNode(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		ListNode head, tail;
		head = tail = new ListNode(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			tail.next = new ListNode(nums[i]);
			tail = tail.next;
		}
		return head;
	}
}