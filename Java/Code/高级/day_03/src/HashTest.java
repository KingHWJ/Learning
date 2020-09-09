import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        System.out.println(p1.hashCode());

        // hashSet
        HashSet<String> h1 = new HashSet<>();

        h1.add("a");
        h1.add("b");
        h1.add("c");
        h1.add("e");

        System.out.println(h1);


        System.out.println(h1.hashCode());

        String s1 = new String("重地");
        String s2 = new String("通话");

        LinkedHashSet<String> l1 = new LinkedHashSet<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        System.out.println(l1);

        HashSet<String> l2 = new HashSet<>();
        l2.add("a");
        l2.add("d");
        l2.add("c");
        l2.add("b");
        System.out.println(l2);



    }
}
