package algo.leetcode.simple;

import algo.leetcode.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 *
 * @author: lyc
 * @date: 2020/1/9 14:00
 * @since: 1.0.0
 */
public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head;
		if (l1 == null) {
			head = l2;
		} else if (l2 == null) {
			head = l1;
		} else {
			ListNode tail = head = new ListNode(0);
			while (l1 != null & l2 != null) {
				if (l1.val < l2.val) {
					tail.next = l1;
					l1 = l1.next;
					tail = tail.next;
				} else if (l1.val > l2.val) {
					tail.next = l2;
					tail = tail.next;
					l2 = l2.next;
				} else {
					tail.next = l1;
					l1 = l1.next;
					tail.next.next = l2;
					l2 = l2.next;
					tail = tail.next.next;
				}
			}

			if (l1 != null) tail.next = l1;
			else tail.next = l2;
			head = head.next;
		}

		return head;
	}

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		ListNode head;
		if (l1 == null) {
			head = l2;
		} else if (l2 == null) {
			head = l1;
		} else {
			ListNode tail = head = new ListNode(0);

			head = head.next;
		}

		return head;
	}
}
