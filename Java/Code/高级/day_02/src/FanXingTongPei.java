import java.util.ArrayList;
import java.util.Collection;

public class FanXingTongPei {
    public static void main(String[] args) {
        Collection<String> l1 = new ArrayList<>();
        l1.add("詹姆斯");
        l1.add("乔丹");
        l1.add("张伯伦");

        Collection<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(10);
        l2.add(100);

        printX(l1);
        printX(l2);


    }
    // 通配符
    // Integer 的子类和他本身
    public static void printX(Collection<?> list) {
        System.out.println(list);
    }
    // Integer的子类和本身
    public static void printXx(Collection<? extends Integer> list) {
        System.out.println(list);
    }

}
