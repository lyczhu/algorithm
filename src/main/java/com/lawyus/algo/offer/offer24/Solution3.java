package com.lawyus.algo.offer.offer24;

/**
 * @author lyc
 * @since 2021/10/24
 *
 * 递归法
 */
public class Solution3 {

    ListNode reverse = null;
    public ListNode reverseList(ListNode head) {
        recursion(head);
        return reverse;
    }

    private ListNode recursion(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            reverse = new ListNode(head.val);
            return reverse;
        }
        ListNode node = recursion(head.next);
        return node.next = new ListNode(head.val);
    }
}
