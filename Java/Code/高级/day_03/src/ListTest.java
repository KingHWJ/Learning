import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();

        l1.add("詹姆斯");
        l1.add("乔丹");
        l1.add("科比");
        l1.add("哈登");
        l1.add("杜兰特");

        //

        System.out.println(l1);

        l1.add(2,"韦德");
        System.out.println(l1);

        System.out.println(l1.get(4));
        String a =  l1.remove(3);
        System.out.println(a);

        l1.set(0,"汤姆");
        System.out.println(l1);

        LinkedList<String> l2 = new LinkedList<>();

        l2.add("语文");
        l2.add("数学");
        l2.add("英语");
        l2.add("物理");
        l2.add("化学");
        l2.add(3,"地理");
        System.out.println(l2);

        System.out.println(l2.getFirst());
        System.out.println(l2.getLast());

        l2.addFirst("生物");
        System.out.println(l2);
        l2.push("abc");
        System.out.println(l2);

        System.out.println(l2.isEmpty());
    }
}
