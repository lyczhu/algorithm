package algo.link;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * TODO: describe please.
 *
 * Author: yushing
 * Date: 2019/11/28 21:38
 */
@Data
public class SingleLinkedList {
    private Node head;

    public SingleLinkedList(int value) {
        head = new Node(value);
    }

    public void add(Node node) {
        head.next = node;
    }

    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList(1);
        System.out.println(sll);
    }
}
