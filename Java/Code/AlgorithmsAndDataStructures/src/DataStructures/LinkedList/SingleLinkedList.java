package DataStructures.LinkedList;

import java.util.Random;

public class SingleLinkedList {
    public static void main(String[] args) {

        Node node1 = new Node(new Random().nextInt(1000));
        Node node2 = new Node(new Random().nextInt(1000));
        Node node3 = new Node(new Random().nextInt(1000));
        Node node4 = new Node(new Random().nextInt(1000));

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(node1);
        singleLinkedList.add(node2);
        singleLinkedList.add(node3);
        singleLinkedList.add(node4);

        singleLinkedList.show();

    }

    private Node head = new Node(0);

    // 添加数据(加至末尾）
    public void add(Node data) {
        // 寻找最后一个节点
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = data;
    }

    // 显示所有节点信息
    public void show() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        while (true) {
            System.out.println(temp.toString());
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
    }
}


// 节点类型
class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}


