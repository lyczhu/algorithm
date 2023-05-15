package com.lawyus.algo.offer.offer20;

/**
 * 表示数值的字符串
 * <a href="https://leetcode.cn/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/">...</a>
 *
 * @author lyc
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isNumber("1.2"));
    }

    public static boolean isNumber(String s) {
        if (s == null || s.length() == 0) return false; // s为空对象或 s长度为0(空字符串)时, 不能表示数值
        boolean isNum = false, isDot = false, ise_or_E = false; // 标记是否遇到数位、小数点、‘e’或'E'
        char[] charArray = s.trim().toCharArray();  // 删除字符串头尾的空格，转为字符数组，方便遍历判断每个字符
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= '0' && charArray[i] <= '9') isNum = true; // 判断当前字符是否为 0~9 的数位
            else if (charArray[i] == '.') { // 遇到小数点
                if (isDot || ise_or_E) return false; // 小数点之前可以没有整数，但是不能重复出现小数点、或出现‘e’、'E'
                isDot = true; // 标记已经遇到小数点
            } else if (charArray[i] == 'e' || charArray[i] == 'E') { // 遇到‘e’或'E'
                if (!isNum || ise_or_E) return false; // ‘e’或'E'前面必须有整数，且前面不能重复出现‘e’或'E'
                ise_or_E = true; // 标记已经遇到‘e’或'E'
                isNum = false; // 重置isNum，因为‘e’或'E'之后也必须接上整数，防止出现 123e或者123e+的非法情况
            } else if (charArray[i] == '-' || charArray[i] == '+') {
                if (i != 0 && charArray[i - 1] != 'e' && charArray[i - 1] != 'E')
                    return false; // 正负号只可能出现在第一个位置，或者出现在‘e’或'E'的后面一个位置
            } else return false; // 其它情况均为不合法字符
        }
        return isNum;
    }

}
