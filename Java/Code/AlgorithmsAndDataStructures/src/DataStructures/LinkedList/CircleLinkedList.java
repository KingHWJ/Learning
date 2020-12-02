package DataStructures.LinkedList;

// 环形链表
public class CircleLinkedList {

    public boyNode first = null;

    /**
     * @param counts 生成多少个子节点
     */
    public void create(int counts) {
        /*
        1.需要两个变量，一个指向最开始的节点不动，另一个节点跟着生成的节点变化
        2.先创建第一个节点，让first指向该节点，并形成环形
        3.后面每当创建一个新的节点，就把该节点，加入到已有的环形链表中
         */
        // 初始化开始节点
        boyNode cur = null;
        // 数据校验
        if (counts < 1) {
            System.out.println("至少需要1个");
            return;
        }

        for (int i = 1; i <= counts; i++) {
            boyNode boy = new boyNode(i);
            if (i == 1) {
                first = boy;
                boy.next = first;
                cur = boy;          // cur指向第一个小孩
            } else {
                cur.next = boy;
                boy.next = first;
                cur = boy;
            }
        }
    }

    // 遍历循环列表
    public void show() {
        if (first == null) {
            System.out.println("列表为空");
            return;
        }
        boyNode cur = first;        // 第一个节点
        while (true) {
            System.out.printf("第%d个节点为：%d\n", cur.no, cur.no);
            // 找到最开始的节点
            if (cur.next == first) {
                break;
            }
            cur = cur.next;         // 移动必须是最后一步才移动，否则还没判断是否最后一个，就移到下一个了
        }
    }

    /**
     * 计算小孩出圈顺序
     *
     * @param startNo  从哪个节点开始
     * @param countNum 数到第几个节点出列
     * @param sumNum   一开始有多少个节点
     */
    public void calculate(int startNo, int countNum, int sumNum) {
        /*
        1.需要两个节点，first指向最开始的节点，helper指向最后一个节点（目的是需要一个指针指向first前一个节点）
        2.从first开始报数，第m个，则需要移动m-1次，则first指向的节点则是需要跳出的节点
         */
        // 数据校验
        if (startNo < 1 || startNo > sumNum || first == null) {
            System.out.println("参数错误");
            return;
        }

        boyNode helper = first;
        // 需要指定first为第一个节点，helper移动到最后一个节点,
        while (true) {
            if (helper.next == first) {
                break;
            }
            helper = helper.next;
        }

        // 根据startNo位置，移动startNo - 1次，移动到指定位置开始
        for (int i = 0; i < startNo - 1; i++) {
            first = first.next;
            helper = helper.next;
        }

        // 开始报数，直到只剩下一个时退出
        while (true) {
            if (helper == first) {
                break;
            }

            for (int i = 0; i < countNum - 1; i++) {
                first = first.next;
                helper = helper.next;
            }

            System.out.println("出圈" + first.no);


            first = first.next;     // first必须要移动，否则会丢失
            helper.next = first;

        }
        System.out.println("最后还剩下：" + first.no);

    }

    public static void main(String[] args) {
        CircleLinkedList circle = new CircleLinkedList();
        circle.create(5);
        circle.calculate(4,2,5);

    }
}

class boyNode {

    public int no = -1;        // 编号
    public boyNode next;       // 下个节点

    public boyNode(int no) {
        this.no = no;
    }

    public boyNode() {

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boyNode getNext() {
        return next;
    }

    public void setNext(boyNode next) {
        this.next = next;
    }
}