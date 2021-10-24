package com.lawyus.algo.offer.offer24;

import lombok.ToString;

/**
 * @author lyc
 * @since 2021/10/24
 *
 * 反转链表
 *
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while (head != null) {
            ListNode tmp = new ListNode(head.val);
            tmp.next = reverse;
            reverse = tmp;
            head = head.next;
        }
        return reverse;
    }
}

@ToString
class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
