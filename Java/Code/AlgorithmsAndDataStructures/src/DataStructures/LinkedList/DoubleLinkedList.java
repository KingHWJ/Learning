package DataStructures.LinkedList;

import java.util.Stack;

public class DoubleLinkedList {

    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        Node2 node1 = new Node2(1);
        Node2 node2 = new Node2(4);
        Node2 node3 = new Node2(3);
        Node2 node4 = new Node2(10);
        Node2 node5 = new Node2(17);
        Node2 node6 = new Node2(100);
        Node2 node7 = new Node2(7);

//        doubleLinkedList.print("末尾添加数据");
//        doubleLinkedList.add(node1);
//        doubleLinkedList.add(node2);
//        doubleLinkedList.add(node3);
//        doubleLinkedList.add(node4);
//        doubleLinkedList.show();
//
        doubleLinkedList.print("按顺序添加数据");
        doubleLinkedList.addIn(node1);
        doubleLinkedList.addIn(node3);
        doubleLinkedList.addIn(node2);
        doubleLinkedList.addIn(node5);
        doubleLinkedList.addIn(node1);
        doubleLinkedList.addIn(node4);
        doubleLinkedList.addIn(node6);
        doubleLinkedList.addIn(node7);
        doubleLinkedList.show();

        doubleLinkedList.print("获取链表长度");
        System.out.println(DoubleLinkedList.getLength(doubleLinkedList.getHead()) + "\n");

        doubleLinkedList.print("逆序打印");
        reversePrint(doubleLinkedList.getHead());

        doubleLinkedList.print("更新节点");
        doubleLinkedList.update(node3,23);
        doubleLinkedList.show();

        doubleLinkedList.print("双向链表反转");
//        reverse(doubleLinkedList.getHead());
        doubleLinkedList.show();

        doubleLinkedList.print("查找倒数第2个节点");
        getNode(doubleLinkedList.getHead(),2);

        doubleLinkedList.print("删除某个节点");
        doubleLinkedList.delete(node4);
        doubleLinkedList.show();

    }

    private Node2 head = new Node2(0);

    public Node2 getHead() {
        return head;
    }

    // 获取有效节点长度（不包括头部节点）
    public static int getLength(Node2 head) {
        if (head.next == null)
            return 0;
        Node2 cur = head;
        int len = 0;
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    // 查找链表中倒数第n个节点
    public static Node2 getNode(Node2 head, int n) {

        if (head.next == null) {
            System.out.println("链表为空");
            return null;
        }

        int size = getLength(head) - n; // 节点有效个数 - 倒数第n个 = 链表中第size个节点
        Node2 cur = head;
        if (n <= 0 || n > getLength(head)) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }
        System.out.println(cur.next);
        return cur.next;
    }

    // 双向链表反转
    public static void reverse(Node2 head) {
        /*
        1.需要三个变量，newHead 用于接住需要反转的节点，cur 当前节点 ，next 当前节点的下一个节点，在头删之后，如果不保存，则无法找到
		2.原链表cur节点，从头至尾进行遍历，cur指向某个节点，节点摘取，在newHead中做头插动作
		3.最后再将原head节点，指向newHead中的链表部分
         */
        // 链表为空或只有一个节点不需要反转
        if (head.next == null || head.next.next == null) {
            return;
        }

        Node2 newHead = new Node2(0);
        Node2 cur = head.next;
        Node2 next = null;
        while (cur != null) {
            next = cur.next;    // 保存下一个节点

            cur.next = newHead.next;
            if(cur.next != null)
                newHead.next.pre = cur;     // 新表的前节点，绑定当前节点
            newHead.next = cur;
            cur.pre = newHead.next;

            cur = next;
        }
        head.next = newHead.next;
    }

    // 逆序打印
    public static void reversePrint(Node2 head) {

        Stack<Node2> stack = new Stack<>();
        Node2 temp = head.next;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }

    }

    // 添加数据(加至末尾）
    public void add(Node2 node) {
        // 寻找最后一个节点
        Node2 temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;

    }

    // 在中间位置添加
    public void addIn(Node2 node) {

        // 空链表，直接在头字段后面添加
        if (head.next == null) {
            head.next = node;
            node.pre = head;
            System.out.println("节点: " + node.data + " 已成功添加");
            return;
        }

        boolean exists_flag = false;
        Node2 temp = head;     // 如果直接使用head.next 如果最后到null节点，无法调用pre节点

        // 寻找准确的位置
        while (true) {

            // 到了节点的尾部，直接添加到尾部
            if (temp.next == null) {
                exists_flag = true;
                break;
            }

            // 找到了重复的数据
            if (temp.data == node.data) {
                System.out.println("该节点: " + node.data + " 已存在，无法添加");
                break;
            }
            // 找到了要放的位置 (放在较大值的前一个位置，如果没有找到，说明这个数是最大的）
            if(temp.next.data > node.data){
                exists_flag = true;
                break;
            }

            temp = temp.next;
        }
        if (exists_flag == true) {

            node.next = temp.next;
            if(temp.next != null){
                temp.next.pre = node;
            }
            temp.next = node;
            node.pre = temp;

//            node.next = temp.next;
//            node.pre = temp;
//            temp.next = node;
//            temp.next.pre = node;
            System.out.println("节点: " + node.data + " 已成功添加");
        }
    }

    // 更新节点数据
    public void update(Node2 node, int newData) {
        if (head.next == null) {
            System.out.println("链表为空，更新失败");
            return;
        }
        boolean exists_flag = false;
        Node2 temp = head;
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
    public void delete(Node2 node) {
        if (head.next == null) {
            System.out.println("链表为空，删除失败");
            return;
        }
        Node2 temp = head.next;
        boolean exists_flag = false;

        while (true) {
            if (temp == null) {
                System.out.printf("未发现该节点%d，删除失败！\n", node.data);
                break;
            }
            if (temp.data == node.data) {
                exists_flag = true;
                break;
            }
            temp = temp.next;
        }
        if (exists_flag == true) {
            temp.pre.next = temp.next;
            // 最后一个节点需要特别注意，null没有pre指针
            if(temp.next != null)
                temp.next.pre = temp.pre;
            System.out.println(node.toString() + "节点已删除");
        }

    }

    // 打印
    public void print(String str){
        System.out.printf("%s-----------------\n",str);
    }

    // 显示所有节点信息
    public void show() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        Node2 temp = head.next;
        while (true) {
            System.out.println(temp.toString());
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

}


// 节点类型
class Node2 {

    public int data;
    public Node2 next;      // 下一个节点
    public Node2 pre;       // 前一个节点

    public Node2(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}


