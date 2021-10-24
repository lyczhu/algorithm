package com.lawyus.algo.leetcode.simple;

import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * Author: yushing
 * Date: 2020/1/8 21:22
 */
public class MajorityElement {

    /**
     * 排序法
     * @param nums
     * @return
     */
    public int sort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * Boyer-Mooer 投票法
     * @param nums
     * @return
     */
    public int boyerMooerVote(int[] nums) {
        int count = 0;
        int majority = nums[0];
        for (int n : nums) {
            if (count == 0) majority = n;
            count += majority == n ? 1 : -1;
        }
        return majority;
    }

    /**
     * Boyer-Mooer 投票法
     * @param nums
     * @return
     */
    public int boyerMooerVote2(int[] nums) {
        int count = 1;
        int majority = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            if (count == 0) majority = nums[i];
            count += majority == nums[i] ? 1 : -1;
        }
        return majority;
    }
}
