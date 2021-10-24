package org.lawyus.algo.offer.offer09;

/**
 * @author lyc
 * @since 2021/10/23
 */
public class CustomStack {

    private Node head;

    public CustomStack() {
    }

    public void push(int value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    public int poll() {
        if (head != null) {
            int value = head.value;
            head = head.next;
            return value;
        }
        return -1;
    }

    class Node {
        public Integer value;
        public Node next;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        System.out.println(stack.poll());
        stack.push(2);
        stack.push(3);
        stack.push(5);

        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
    }
}
