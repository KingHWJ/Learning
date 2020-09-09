package Demo2;

import java.util.ArrayList;

public class QiangRed {
    public static void main(String[] args) {
        // 群主
        Manger host = new Manger("杭文杰",100);

        // 群员
        Member one = new Member("张三",0);
        Member two = new Member("李四",0);
        Member three = new Member("王五",0);

        host.show();
        one.show();
        two.show();
        three.show();
        System.out.println("-----------------");

        ArrayList<Integer> red = host.send(4,22);
        System.out.println(red);
        one.receive(red);
        two.receive(red);
        three.receive(red);

        host.show();
        one.show();
        two.show();
        three.show();

    }
}
