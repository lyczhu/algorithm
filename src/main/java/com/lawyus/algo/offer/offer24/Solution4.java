package com.lawyus.algo.offer.offer24;

/**
 * @author lyc
 * @since 2021/10/24
 *
 * 递归法
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/solution/jian-zhi-offer-24-fan-zhuan-lian-biao-die-dai-di-2/
 */
public class Solution4 {

    public ListNode reverseList(ListNode head) {
        return recursion(head, null);
    }

    private ListNode recursion(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }
        ListNode res = recursion(cur.next, cur);
        cur.next = pre;
        return res;
    }
}
