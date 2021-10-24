package com.lawyus.algo.leetcode.simple;

import com.lawyus.algo.leetcode.ListNode;

/**
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle
 * Author: yushing
 * Date: 2020/1/8 22:21
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode s = head;
        ListNode f = head.next;
        while (f != s) {
            if (f == null || f.next == null) {
                return false;
            }
            s = s.next;
            f = f.next.next;
        }
        return true;
    }

    public boolean hasCycle2(ListNode head) {
        while(head != null){
            if(head == head.next) return true;
            if(head.next != null) head.next = head.next.next;
            head = head.next;
        }
        return false;
    }

}
