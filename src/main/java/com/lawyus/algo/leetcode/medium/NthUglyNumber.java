package com.lawyus.algo.leetcode.medium;

/**
 * 编写一个程序，找出第 n 个丑数。
 *
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例:
 *
 * 输入: n = 10
 * 输出: 12
 * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
 * 说明:  
 *
 * 1 是丑数。
 * n 不超过1690。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ugly-number-ii
 *
 * @author: lyc
 * @date: 2020/1/13 17:50
 * @since: 1.0.0
 */
public class NthUglyNumber {

	/**
	 * 三指针法
	 * @param n
	 * @return
	 */
	public int nthUglyNumber(int n) {
		int[] uns = new int[n];
		uns[0] = 1;
		int p2 = 0, p3 = 0, p5 = 0;
		int i = 1;
		while (i < n) {
			int result = Math.min(Math.min(uns[p2] * 2, uns[p3] * 3), uns[p5] * 5);
			if (result == uns[p2] * 2) p2++;
			if (result == uns[p3] * 3) p3++;
			if (result == uns[p5] * 5) p5++;
			uns[i++] = result;
		}
		return uns[n-1];
	}
}
