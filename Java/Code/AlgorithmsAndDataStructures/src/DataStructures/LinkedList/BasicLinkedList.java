package DataStructures.LinkedList;

public class BasicLinkedList {
    // 添加头部节点
    private Node head;
    // 链表长度
    private int size;

    public class Node{
        private Object data;   // 节点存储数据
        private Node next;     // 下个节点

        public Node(Object data) {
            this.data = data;
        }
    }

    public BasicLinkedList(){
        head = null;
        size = 0;
    }
    
}
