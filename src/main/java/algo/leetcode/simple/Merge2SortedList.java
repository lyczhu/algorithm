package algo.leetcode.simple;

import algo.leetcode.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 *
 * @author: lyc
 * @date: 2020/1/9 14:00
 * @since: 1.0.0
 */
public class Merge2SortedList {
    public ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (l1 != null & l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = l1 == null ? l2 : l1;
        return head.next;
    }

	public ListNode merge2Lists1(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val <= l2.val) {
			l1.next = merge2Lists1(l1.next, l2);
			return l1;
		} else {
			l2.next = merge2Lists1(l1, l2.next);
			return l2;
		}
	}

    /**
     * 插入排序法
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode merge2Lists2(ListNode l1, ListNode l2) {
		ListNode head;
		if (l1 == null) {
			head = l2;
		} else if (l2 == null) {
			head = l1;
		} else {
			ListNode tail = head = l1;
			ListNode pre = tail;
			while (l2 != null && tail != null) {
				if (l2.val > tail.val) {
					pre = tail;
					tail = tail.next;
				} else {
					if (l2.val < pre.val) {
						ListNode l2Next = l2.next;
						l2.next = pre;
						head = tail = pre = l2;
						l2 = l2Next;
					} else {
						tail = pre.next;
						pre.next = l2;
						l2 = l2.next;
						pre = pre.next;
						pre.next = tail;
						tail = pre;
					}

				}
			}
			if (tail == null)
				pre.next = l2;
		}
		return head;
	}

	public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
		ListNode head;
		if (l1 == null) {
			head = l2;
		} else if (l2 == null) {
			head = l1;
		} else {
			ListNode tail, pre;
			if (l1.val <= l2.val) {
				head = tail = pre = l1;
			} else {
				head = tail = pre = l2;
				l2 = l1;
			}
			while (l2 != null && tail != null) {
				if (l2.val > tail.val) {
					pre = tail;
					tail = tail.next;
				} else {
					tail = pre.next;
					pre.next = l2;
					l2 = l2.next;
					pre = pre.next;
					pre.next = tail;
					tail = pre;
				}
			}
			if (tail == null)
				pre.next = l2;
		}
		return head;
	}
}
