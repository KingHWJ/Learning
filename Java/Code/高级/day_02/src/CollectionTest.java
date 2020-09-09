import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> set = new ArrayList<>();

        System.out.println(set);

        // 添加功能
        set.add("Lebron James");
        set.add("Kobe Brant");
        set.add("Michal Jordan");
        set.add("Carmelo");
        boolean r = set.add("Jack");
        // System.out.println(r);
        System.out.println(set);

        // 删除功能
        // r = set.remove("Dan");  如果没有这个数据，返回的数据是false
        // r = set.remove("Jack"); 有，返回true
        // System.out.println(r);
        System.out.println(set);

        // 包含功能
        r = set.contains("Jack");  // 如果包含某个人
        System.out.println(r);

        // 是否为空
        boolean is_empty = set.isEmpty();
        System.out.println(is_empty);

        // 大小
        System.out.println(set.size());

        // 把集合变成数组
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
