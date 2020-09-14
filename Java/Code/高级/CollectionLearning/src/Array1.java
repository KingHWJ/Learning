import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Array1 {
    public static void main(String[] args) {
        // 数组
        /*
        1.长度是固定的，确定之后无法修改
        2.数组类型，在声明时就确定好，无法更改
         */
        int[] a = {1,2,3,4,5};
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a[2]);
        System.out.println(Arrays.toString(a));

        // 集合
        Collection<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(11);
        b.add(12);
        b.add(13);
        b.add(14);
        System.out.println(b.size());
        System.out.println(b.contains(1));

        //Iterable
        Iterator<Integer> iterator = b.iterator();
        System.out.println(iterator.next());

        //
        System.out.println(iterator.hasNext());
    }
}
