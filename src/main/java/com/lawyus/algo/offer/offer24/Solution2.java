package com.lawyus.algo.offer.offer24;

/**
 * @author lyc
 * @since 2021/10/24
 *
 * 双指针法
 *
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/solution/jian-zhi-offer-24-fan-zhuan-lian-biao-die-dai-di-2/
 */
public class Solution2 {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            // 暂存next
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
