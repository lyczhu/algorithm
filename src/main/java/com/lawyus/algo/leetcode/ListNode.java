package com.lawyus.algo.leetcode;

import lombok.ToString;

/**
 * 单链表
 * Definition for singly-linked list.
 *
 * @author: lyc
 * @date: 2020/1/9 15:16
 * @since: 1.0.0
 */
@ToString
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
