package com.lawyus.algo.offer.offer35;

/**
 * @author lyc
 * @since 2021/10/24
 *
 * 迭代 + 节点拆分
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/solution/fu-za-lian-biao-de-fu-zhi-by-leetcode-so-9ik5/
 */
public class Solution3 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = cur.next.next;
        }
        cur = head;
        while (cur != null) {
            cur.next.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }
        Node headNew = head.next;
        cur = head;
        while (cur != null) {
            Node newNode = cur.next;
            cur.next = newNode.next;
            newNode.next = newNode.next == null ? null : newNode.next.next;
            cur = cur.next;
        }
        return headNew;
    }

}
