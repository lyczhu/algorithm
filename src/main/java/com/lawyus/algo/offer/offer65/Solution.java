package com.lawyus.algo.offer.offer65;

/**
 * 不用加减乘除做加法
 * <a href="https://leetcode.cn/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/">...</a>
 *
 * @author lyc
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(add(10, 5));
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }


}
