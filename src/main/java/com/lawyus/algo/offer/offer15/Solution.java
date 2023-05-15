package com.lawyus.algo.offer.offer15;

/**
 *  二进制中1的个数
 *  <a href="https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/">...</a>
 *
 * @author lyc
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }

    public static int hammingWeight(int n) {
        int num = 0;
        while (n != 0) {
            num++;
            n = n & (n - 1);
        }
        return num;
    }
}
