package com.lawyus.algo.offer.offer17;

/**
 * 打印从1到最大的n位数
 *
 * @author lyc
 * @date 2023/5/23
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i : solution.printNumbers(1)) {
            System.out.println(i);
        }
    }

    public int[] printNumbers(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int length = 1;
        for (int i = 0; i < n; i++) {
            length = length * 10;
        }
        int[] array = new int[length - 1];
        for (int i = 1; i < length; i++) {
            array[i - 1] = i;
        }
        return array;
    }

}
