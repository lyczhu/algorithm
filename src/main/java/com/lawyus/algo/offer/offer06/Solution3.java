package com.lawyus.algo.offer.offer06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyc
 * @since 2021/10/24
 *
 * 递归法
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/solution/mian-shi-ti-06-cong-wei-dao-tou-da-yin-lian-biao-d/
 */
public class Solution3 {

    List<Integer> list = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        recursion(head);
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
    private void recursion(ListNode head) {
        if (head == null) {
            return;
        }
        recursion(head.next);
        list.add(head.val);
    }
}
