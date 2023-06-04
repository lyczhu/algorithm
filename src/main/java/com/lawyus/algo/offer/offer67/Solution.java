package com.lawyus.algo.offer.offer67;

/**
 * 把字符串转换成整数
 *
 * @author lyc
 * @date 2023/5/22
 */
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.strToInt("- 234"));
    }

    public int strToInt(String str) {
        if (str == null || str.length() == 0) return 0;
        long number = 0L;
        int sign = 0;

        boolean numberStarted = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (sign != 0 || numberStarted) break;
            } else if (c == '+' || c == '-') {
                if (sign != 0 || numberStarted) break;
                sign = c == '+' ? 1 : -1;
            } else if (c >= '0' && c <= '9') {
                numberStarted = true;
                number = number * 10 + c - '0';
                number = sign >= 0 ? Math.min(Integer.MAX_VALUE, number) : Math.min(-(long)Integer.MIN_VALUE, number);
            } else {
                break;
            }
        }
        return (int) ((sign >= 0 ? 1 : -1) * number);
    }
}
