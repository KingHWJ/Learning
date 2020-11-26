package DataStructures.LinkedList;

import java.util.Stack;

public class HeroLinkedList {

    public static void main(String[] args) {

        System.out.println("单向节点测试-----------------------------");
        HeroSingleLinkedList heroSingleLinkedList = new HeroSingleLinkedList();

        HeroNode hero1 = new HeroNode(1, "及时雨", "宋江");
        HeroNode hero2 = new HeroNode(2, "玉麒麟", "卢俊义");
        HeroNode hero3 = new HeroNode(3, "智多星", "吴用");
        HeroNode hero4 = new HeroNode(4, "入云龙", "公孙胜");

        System.out.println("修改前-----------------");
        // 插入尾部
//        heroSingleLinkedList.add(hero3);
//        heroSingleLinkedList.add(hero1);
//        heroSingleLinkedList.add(hero2);
        // 插入中间
        heroSingleLinkedList.addIn(hero3);
        heroSingleLinkedList.addIn(hero2);
//        heroSingleLinkedList.addIn(hero2);
        heroSingleLinkedList.addIn(hero1);
        heroSingleLinkedList.addIn(hero4);
        heroSingleLinkedList.show();
        System.out.println("修改后-----------------");
        heroSingleLinkedList.update(new HeroNode(3,"智多星吗？","没用"));
        heroSingleLinkedList.update(new HeroNode(3,"智多星吗？","没用"));
        heroSingleLinkedList.show();
        System.out.println("删除后-----------------");
//        heroSingleLinkedList.delete(hero3);
        heroSingleLinkedList.delete(new HeroNode(5,"",""));
        heroSingleLinkedList.show();
        System.out.println("反转后-----------------");
//        HeroSingleLinkedList.reverse(heroSingleLinkedList.getHead());
        heroSingleLinkedList.show();

        System.out.println("逆序打印,不破坏链表的结构------");
        HeroSingleLinkedList.reversePrint(heroSingleLinkedList.getHead());
        System.out.println("原链表为：");
        heroSingleLinkedList.show();

        System.out.println("\n\n双向节点测试-----------------------------");
        HeroDoubleLinkedList heroDoubleLinkedList = new HeroDoubleLinkedList();
        Hero2Node herod_1 = new Hero2Node(1, "及时雨", "宋江");
        Hero2Node herod_2 = new Hero2Node(2, "玉麒麟", "卢俊义");
        Hero2Node herod_3 = new Hero2Node(3, "智多星", "吴用");
        Hero2Node herod_4 = new Hero2Node(4, "入云龙", "公孙胜");
        heroDoubleLinkedList.add(herod_1);
        heroDoubleLinkedList.add(herod_2);
        heroDoubleLinkedList.add(herod_3);
        heroDoubleLinkedList.add(herod_4);
        heroDoubleLinkedList.show();

    }
}

// 单向链表
class HeroSingleLinkedList {

    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

    // 逆序打印
    public static void reversePrint(HeroNode head){
        /*
        1.利用栈的先入后出的原理，遍历每个节点，进行压栈
        2.遍历栈，进行出栈打印
         */
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    // 反转节点
    public static HeroNode reverse(HeroNode head){
        // 节点为空，或只有一个节点，无需反转
        if(head.next == null || head.next.next == null){
            return null;
        }
        /*
        1.需要定义三个节点变量，cur -- 当前节点，next -- 当前节点的下一个节点，newHead -- 接住反转的节点
        2.当期节点持续向右遍历,摘下当前节点，进行插首操作：cur指向newHead的next节点，同时newHead节点，指向cur节点
        3.cur节点右移,直到cur == null
        4.head的next节点 指向newHead的next节点
         */
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode newHead = new HeroNode(0,"","");

        while (cur != null){
            next = cur.next;            // 暂时先保存cur节点下一个节点，因为改变cur节点next指向，如果不保存会丢失
            cur.next = newHead.next;    // 原链表当前节点（被摘下）指向新链表头指向的next节点（插首操作）
            newHead.next = cur;         // 新链表next指向当前被摘下的节点
            cur = next;                 // 指针右移
        }
        head.next = newHead.next;       // 将原链表的头，指向已经反转的新链表
        return head;
    }


    // 添加数据
    public void add(HeroNode node) {
        /*
        1.从头节点开始，在最后面添加
        2.head节点不能动， 需要一个temp变量，遍历
         */
        HeroNode temp = head;
        while (true) {
            // 找到最后一个节点
            if (temp.next == null) {
                break;
            }
            // 节点后移
            temp = temp.next;
        }
        temp.next = node;
    }

    // 显示链表信息
    public void show() {
        if (head.next == null) {
            System.out.println("这是一条空链表");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            System.out.println(temp.toString());
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
    }

    // 在中间添加数据
    public void addIn(HeroNode node){
        /*
        1.找到需要插入的节点位置，如果节点存在，提示
        2.需要一个临时变量来遍历，如果找到位置，temp应该为插入节点位置的前一个节点
         */
        boolean exist_flag = false;     // 节点存在，则为true
        HeroNode temp = head;           // 临时节点

        if(head.next == null){
            head.next = node;
            return;
        }
        // 寻找合适的节点
        while (true){
            // 已经到链表尾部
            if(temp.next == null){
                exist_flag = true;
                break;
            }
            if(temp.next.no > node.no){
                exist_flag = true;
                break;
            }
            if(temp.next.no == node.no){
                System.out.println("该节点已存在，插入失败！");
                return;
            }
            temp = temp.next;
        }
        if(exist_flag == true){
            node.next = temp.next;
            temp.next = node;
        }
    }

    // 修改节点信息
    public void update(HeroNode node){
        /*
        1.找到要修改节点的位置，如果没有，直接退出
        2.需要一个临时变量，遍历
         */
        HeroNode temp = head;
        boolean exists_flag = false;    // 是否存在该节点标记
        if(temp.next == null){
            System.out.println("链表为空！");
            return;
        }
        while (true){
            // 链表走完
            if(temp.next == null){
                break;
            }
            if(temp.no == node.no){
                exists_flag = true;
                break;
            }
            // 指针切换下一个节点
            temp = temp.next;
        }
        // 切换节点
        if(exists_flag == true){
            temp.name = node.name;
            temp.nickname = node.nickname;
            System.out.printf("节点%d，已更新\n",node.no);
        }else{
            System.out.printf("很抱歉，没有找到节点%d的数据\n",node.no);
        }
    }

    // 删除节点
    public void delete(HeroNode node){
        /*
        1.找到需要删除节点的位置的前一个节点，因为，如果直接定位到要删除的节点，它前个节点的信息，无法获取
        2.临时变量，遍历
         */
        HeroNode temp = head;
        boolean exists_flag = false;
        if(temp.next == null){
            System.out.println("这是一条空链表");
            return;
        }
        while (true){
            // 先判断末节点，否则会报空指针异常
            if(temp.next == null){
                System.out.println("没有找到该节点");
                break;
            }

            // 待删除节点的前一个
            if(temp.next.no == node.no){
                exists_flag = true;
                break;
            }

            temp = temp.next;
        }

        if(exists_flag == true){
            temp.next = temp.next.next;
            System.out.printf("节点%d,已删除\n",node.no);
        }

    }

}

class HeroNode {

    public int no;             // 编号
    public String nickname;    // 绰号
    public String name;        // 姓名

    public HeroNode next;      // 下一个节点

    public HeroNode(int hNo, String hNickname, String hName) {
        this.no = hNo;
        this.nickname = hNickname;
        this.name = hName;
    }

    // 重写toString方法，展示节点信息
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

// 双向链表
class Hero2Node{
    public int no;             // 编号
    public String nickname;    // 绰号
    public String name;        // 姓名

    public Hero2Node next;      // 下一个节点
    public Hero2Node pre;       // 前一个节点

    public Hero2Node(int hNo, String hNickname, String hName) {
        this.no = hNo;
        this.nickname = hNickname;
        this.name = hName;
    }

    @Override
    public String toString() {
        return "Hero2Node{" +
                "no=" + no +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class HeroDoubleLinkedList{

    private Hero2Node head = new Hero2Node(0,"","");

    public Hero2Node getHead() {
        return head;
    }

    // 增加节点
    // 添加数据
    public void add(Hero2Node node) {
        /*
        1.从头节点开始，在最后面添加
        2.head节点不能动， 需要一个temp变量，遍历
         */
        Hero2Node temp = head;
        while (true) {
            // 找到最后一个节点
            if (temp.next == null) {
                break;
            }
            // 节点后移
            temp = temp.next;
        }
        temp.next = node;
    }

    // 显示链表信息
    public void show() {
        if (head.next == null) {
            System.out.println("这是一条空链表");
            return;
        }
        Hero2Node temp = head.next;
        while (true) {
            System.out.println(temp.toString());
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
    }

}