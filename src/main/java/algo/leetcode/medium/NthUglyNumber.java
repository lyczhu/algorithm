package algo.leetcode.medium;

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
	public int nthUglyNumber(int n) {
		if (n == 1) return 1;
		int[] nums = {2, 3, 5};

		return 0;
	}
}
