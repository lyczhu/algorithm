package org.lawyus.algo.offer.offer09;

import java.util.Stack;

/**
 * @author lyc
 * @since 2021/10/23
 */
public class Offer09 {

    class CQueue {
        private Stack<Integer> pushStack, popStack;

        public CQueue() {
            pushStack = new Stack<>();
            popStack = new Stack<>();
        }

        public void appendTail(int value) {
            pushStack.push(value);
        }

        public int deleteHead() {
            if (popStack.isEmpty()) {
                while (!pushStack.isEmpty()) {
                    popStack.push(pushStack.pop());
                }
            }
            return popStack.isEmpty() ? -1 : popStack.pop();
        }
    }
}
