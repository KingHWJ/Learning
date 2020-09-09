import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("杭文杰");
        list.add("杭文杰");
        list.add("杭文杰");
        list.add("杭文杰");
        list.add("杭文杰");

        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
