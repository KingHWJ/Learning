import java.util.ArrayList;

public class ArrayListTest2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);

        // 添加元素
        list.add("詹姆斯");
        list.add("科比");
        list.add("乔丹");
        list.add("艾弗森");
        list.add("哈登");

        System.out.println(list);

        // 获取元素
        String result = list.get(0);
        System.out.println(result);

        // 删除元素
        String r = list.remove(4);
        System.out.println("被删除的是：" + r);
        System.out.println(list);

        // 获取元素大小
        System.out.println(list.size());

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        paint(list);


    }

    public static void paint(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print("{" + list.get(i) + "@");
            } else if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }

}
