package algo.leetcode.difficult;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 返回 A 的最短的非空连续子数组的长度，该子数组的和至少为 K 。
 *
 * 如果没有和至少为 K 的非空子数组，返回 -1 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：A = [1], K = 1
 * 输出：1
 * 示例 2：
 *
 * 输入：A = [1,2], K = 4
 * 输出：-1
 * 示例 3：
 *
 * 输入：A = [2,-1,2], K = 3
 * 输出：3
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 50000
 * -10 ^ 5 <= A[i] <= 10 ^ 5
 * 1 <= K <= 10 ^ 9
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-subarray-with-sum-at-least-k
 * Author: yushing
 * Date: 2020/1/14 22:50
 */
public class ShortestSubarraySumK {

    /**
     * 方法一：滑动窗口
     * @param A
     * @param k
     * @return
     */
    public int shortestSubarray(int[] A, int k) {
        int n = A.length;
        long[] p = new long[n + 1];
        for (int i = 0; i < n; i++) {
            p[i + 1] = p[i] + (long) A[i];
        }
        // Want smallest y-x with P[y] - P[x] >= K
        int ans = n + 1; // n+1 is impossible
        Deque<Integer> indices = new LinkedList<>();
        for (int y = 0; y < p.length; y++) {
            // Want opt(y) = largest x with P[x] <= P[y] - K;
            while (!indices.isEmpty() && p[y] <= p[indices.getLast()]) {
                indices.removeLast();
            }
            while (!indices.isEmpty() && p[y] - p[indices.getFirst()] >= k) {
                ans = Math.min(ans, y - indices.removeFirst());
            }
            indices.addLast(y);
        }
        return ans < n + 1 ? ans : -1;
    }
}
