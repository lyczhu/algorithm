package org.lawyus.algo.offer.offer09;

/**
 * @author lyc
 * @since 2021/10/23
 */
public class Queue {

    /**
     * 队列：先进先出
     * 队头
     * 队尾
     * 队列
     */

    private Node head;
    private Node tail;

    public Queue() {
    }

    public void addTail(int value) {
        Node next = new Node(value);
        if (tail == null) {
            head = tail = next;
        } else {
            tail.next = next;
            tail = tail.next;
        }
    }

    public int deleteHead() {
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
        Queue queue = new Queue();
        queue.addTail(3);
        queue.addTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }
}
