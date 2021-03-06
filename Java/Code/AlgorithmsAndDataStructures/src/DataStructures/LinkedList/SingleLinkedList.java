package DataStructures.LinkedList;

import java.util.Random;
import java.util.Stack;

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

        System.out.println("反转后----------");
//        SingleLinkedList.reverse(singleLinkedList.getHead());
        singleLinkedList.show();
        System.out.println("逆序打印----------");
        SingleLinkedList.reversePrint(singleLinkedList.getHead());
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
    public static void reverse(Node head){
        /*
        1.需要三个变量，newHead 用于接住需要反转的节点，cur 当前节点 ，next 当前节点的下一个节点，在头删之后，如果不保存，则无法找到
		2.原链表cur节点，从头至尾进行遍历，cur指向某个节点，节点摘取，在newHead中做头插动作
		3.最后再将原head节点，指向newHead中的链表部分
         */
        // 链表为空或只有一个节点不需要反转
        if(head.next == null || head.next.next == null){
            return;
        }

        Node newHead = new Node(0);
        Node cur = head.next;
        Node next = null;
        while (cur != null){
            next = cur.next;
            cur.next = newHead.next;
            newHead.next = cur;
            cur = next;
        }
        head.next = newHead.next;
    }

    // 逆序打印
    public static void reversePrint(Node head){

        Stack<Node> stack = new Stack<>();
        Node temp = head.next;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        while (stack.size() > 0 ){
            System.out.println(stack.pop());
        }

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


