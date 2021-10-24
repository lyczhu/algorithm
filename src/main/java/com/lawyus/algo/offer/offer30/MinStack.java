package org.lawyus.algo.offer.offer30;

import java.util.Stack;

/**
 * @author lyc
 * @since 2021/10/23
 *
 * https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
public class MinStack {

    private Stack<Integer> a, b;

    /** initialize your data structure here. */
    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);
        if (b.isEmpty() || b.peek() >= x) {
            b.push(x);
        }
    }

    public void pop() {
        if (a.pop().equals(b.peek())) {
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
