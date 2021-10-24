package com.lawyus.algo.offer.offer35;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lyc
 * @since 2021/10/24
 *
 * 回溯 + 哈希表
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/solution/fu-za-lian-biao-de-fu-zhi-by-leetcode-so-9ik5/
 */
public class Solution2 {

    Map<Node, Node> cacheMap = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        while (!cacheMap.containsKey(head)) {
            Node newNode = new Node(head.val);
            cacheMap.put(head, newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);
        }
        return cacheMap.get(head);
    }

}
