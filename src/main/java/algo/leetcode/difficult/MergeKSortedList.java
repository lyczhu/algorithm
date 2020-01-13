package algo.leetcode.difficult;

import algo.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
 *
 * @author: lyc
 * @date: 2020/1/9 13:56
 * @since: 1.0.0
 */
public class MergeKSortedList {

	/**
	 * violence
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		List<Integer> list = new ArrayList<>();
		for (ListNode l : lists) {
			while (l != null) {
				list.add(l.val);
				l = l.next;
			}
		}
		list.sort(Integer::compareTo);
		ListNode head = new ListNode(0);
		ListNode p = head;
		for (Integer i : list) {
			p.next = new ListNode(i);
			p = p.next;
		}
		return head.next;
	}

	/**
	 * compare one by one
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists2(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		ListNode head = new ListNode(0);
		ListNode n = head;

		return null;
	}

	/**
	 * merge two by two
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists3(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		ListNode head = merge2List(lists[0], lists.length < 2 ? null : lists[1]);
		for (int i = 2; i < lists.length; i++) {
			head = merge2List(head, lists[i]);
		}
		return head;
	}

	/**
	 * divide and conquer
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists4(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		int length = lists.length;
		int interval = 1;
		while (interval < length) {
			for (int i = 0; i < length - interval; i += interval << 1) {
				lists[i] = merge2List(lists[i], lists[i + interval]);
			}
			interval = interval << 1;
		}
		return lists[0];
	}


	/**
	 * merge two linkedList
	 * @param l1
	 * @param l2
	 * @return
	 */
	private ListNode merge2List(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode n = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				n.next = l1;
				l1 = l1.next;
			} else {
				n.next = l2;
				l2 = l2.next;
			}
			n = n.next;
		}
		n.next = l1 == null ? l2 : l1;
		return head.next;
	}

}
