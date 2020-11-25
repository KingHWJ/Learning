package DataStructures.LinkedList;

public class HeroLinkedList {

    public static void main(String[] args) {
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
        heroSingleLinkedList.delete(hero3);
//        heroSingleLinkedList.delete(new HeroNode(5,"",""));
        heroSingleLinkedList.show();


    }
}

class HeroSingleLinkedList {

    private HeroNode head = new HeroNode(0, "", "");

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