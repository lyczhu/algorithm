package com.lawyus.algo.offer.offer58;

/**
 * 左旋转字符串
 * <a href="https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/">...</a>
 *
 * @author lyc
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }

    public static String reverseLeftWords(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            result.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
