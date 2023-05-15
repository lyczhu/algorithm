package com.lawyus.algo.offer.offer05;

/**
 * 替换空格
 * <a href="https://leetcode.cn/problems/ti-huan-kong-ge-lcof/">...</a>
 *
 * @author lyc
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        String[] arr = s.split("");
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            if (str.equals(" ")) {
                str = "%20";
            }
            result.append(str);
        }
        return result.toString();
    }
}
