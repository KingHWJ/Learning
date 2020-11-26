package DataStructures.LinkedList;

import java.util.Random;

public class SingleLinkedList {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(4);
        Node node3 = new Node(3);
        Node node4 = new Node(10);

        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.add(node1);
//        singleLinkedList.add(node2);
//        singleLinkedList.add(node3);
//        singleLinkedList.add(node4);
        System.out.println("修改前---------");
        singleLinkedList.addIn(node1);
        singleLinkedList.addIn(node2);
        singleLinkedList.addIn(node3);
        singleLinkedList.addIn(node4);
        singleLinkedList.show();
        System.out.println("链表长度为" + getLength(singleLinkedList.getHead()));
        System.out.println("修改后---------");
        singleLinkedList.update(node2, 17);
        singleLinkedList.show();
        System.out.println("链表长度为" + getLength(singleLinkedList.getHead()));
        System.out.println("删除后---------");
        singleLinkedList.delete(node2);
        singleLinkedList.show();
        System.out.println("链表长度为" + getLength(singleLinkedList.getHead()));

        System.out.println("倒数第n个节点为：" + getNode(singleLinkedList.getHead(),1));
    }

    private Node head = new Node(0);

    public Node getHead() {
        return head;
    }

    // 获取有效节点长度（不包括头部节点）
    public static int getLength(Node head) {
        if (head.next == null)
            return 0;
        Node cur = head;
        int len = 0;
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    // 查找链表中倒数第n个节点
    public static Node getNode(Node head, int n) {

        if(head.next == null){
            System.out.println("链表为空");
            return null;
        }

        int size = getLength(head) - n; // 节点有效个数 - 倒数第n个 = 链表中第size个节点
        Node cur = head;
        if( n <= 0 || n > getLength(head)){
            return null;
        }
        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }
        return cur.next;
    }

    // 单链表反转
    public static Node reverse(Node head){
        /*
        1.创建一个临时节点temp，从头遍历至末尾，做头删操作
        2.创建一个newHead节点，初始指向null,temp切断的节点，在newHead中做头插操作
        3.newHead 指向 temp, temp.nex 指向null
         */
        Node newNode = null;
        Node temp = head.next;
        if(temp == null){
            System.out.println("空链表，反转失败");
            return null;
        }

        return null;
    }


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

    // 在中间位置添加
    public void addIn(Node node) {
        // 空链表，直接在头字段后面添加
        if (head.next == null) {
            head.next = node;
            System.out.println("节点: " + node.data + " 已成功添加");
            return;
        }
        boolean exists_flag = false;
        Node temp = head;
        // 寻找准确的位置
        while (true) {
            // 到了节点的尾部，直接添加到尾部
            if (temp.next == null) {
                exists_flag = true;
                break;
            }
            // 找到了重复的数据
            if (temp.next.data == node.data) {
                System.out.println("该节点: " + node.data + " 已存在，无法添加");
                break;
            }
            // 找到要加的位置，的前一个节点
            if (temp.next.data > node.data) {
                exists_flag = true;
                break;
            }
            temp = temp.next;
        }
        if (exists_flag == true) {
            node.next = temp.next;
            temp.next = node;
            System.out.println("节点: " + node.data + " 已成功添加");
        }
    }

    // 更新节点数据
    public void update(Node node, int newData) {
        if (head.next == null) {
            System.out.println("链表为空，更新失败");
            return;
        }
        boolean exists_flag = false;
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                System.out.printf("未发现该节点%d，更新失败！\n", node.data);
                break;
            }
            if (temp.data == node.data) {
                exists_flag = true;
                break;
            }
            temp = temp.next;
        }

        if (exists_flag == true) {
            System.out.printf("数据已更新\n");
            node.data = newData;
        }
    }

    // 删除节点信息
    public void delete(Node node) {
        if (head.next == null) {
            System.out.println("链表为空，删除失败");
            return;
        }
        Node temp = head;
        boolean exists_flag = false;
        while (true) {
            if (temp.next == null) {
                System.out.printf("未发现该节点%d，删除失败！\n", node.data);
                break;
            }
            if (temp.next.data == node.data) {
                exists_flag = true;
                break;
            }
            temp = temp.next;
        }
        if (exists_flag == true) {
            temp.next = temp.next.next;
            System.out.println("数据已删除");
        }

    }

    //
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


