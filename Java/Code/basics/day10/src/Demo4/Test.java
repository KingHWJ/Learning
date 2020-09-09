package Demo4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 多态写法，左边是接口名称， 右边是实现类名称
        List<String> list = new ArrayList<>();
        System.out.println(list);
        addNames(list);
        System.out.println(list);



    }

    public static List<String> addNames(List<String> list){
        list.add("詹姆斯");
        list.add("科比");
        list.add("乔丹");
        list.add("周杰伦");
        return list;

    }
}
