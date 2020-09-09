import java.util.ArrayList;
import java.util.Random;

public class ToSringTest {
    public static void main(String[] args) {

        // 看一个类是否重写了toString方法，就看它打印的是不是地址值，如果打印了，说明没有重写这个方法
        Person p = new Person();
        System.out.println(p.toString());

        Random r = new Random();
        System.out.println(r.toString());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println(list);
        System.out.println(list.toString());
    }
}
