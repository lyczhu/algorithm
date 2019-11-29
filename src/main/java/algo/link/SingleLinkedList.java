package algo.link;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * TODO: describe please.
 *
 * Author: yushing
 * Date: 2019/11/28 21:38
 */
@Data
public class SingleLinkedList {

    /**
     * 1. 删除指定节点的下一节点
     * 2. 删除指定节点
     * 3. 删除头节点
     * 4. 删除尾节点
     * 5. 头部插入
     * 6. 尾部插入
     * 7. 指定节点后插入
     * 8. 创建链表
     * 9. 按值查找
     * 10. 按位置查找
     * 11. 链表反转
     */


    private Node head;

    /**
     * 尾部插入（顺序插入）
     * @param value
     */
    public void add(int value) {
        Node node = new Node(value);
        addNode(node);
    }

    /**
     * 尾部插入（顺序插入）
     * @param node
     */
    public void addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            if (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    /**
     * 头部插入
     * @param value
     */
    public void addAtHead(int value) {
        Node node = new Node(value);
        addAtHead(node);
    }

    /**
     * 头部插入
     * @param node
     */
    public void addAtHead(Node node) {
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    /**
     * 按值查找节点
     * @param value
     * @return
     */
    public Node findByValue(int value) {
        Node n = head;
        if (head != null && value != head.data) {
            n = n.next;
        }
        return n;
    }

    class Node {
        private int data;
        @Setter
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
        SingleLinkedList sll = new SingleLinkedList();
        System.out.println(sll);
    }
}
