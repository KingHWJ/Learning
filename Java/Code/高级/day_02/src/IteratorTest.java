import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        // 迭代器，对集合进行遍历
        Collection<String> str = new ArrayList<>();

        str.add("詹姆斯");
        str.add("科比");
        str.add("乔丹");
        str.add("韦德");
        str.add("张伯伦");
        /*
        Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象
        Collection接口中有一个方法，叫iterator（），这个方法返回单值就是迭代器的实现类对象
         */
        Iterator<String> it = str.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
