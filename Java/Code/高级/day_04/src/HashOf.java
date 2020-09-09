import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashOf {
    public static void main(String[] args) {
        List<String> l1 = List.of("a","b","c","d");
        System.out.println(l1);
//        l1.add("e");
//        System.out.println(l1);

        Set<Integer> l2 = Set.of(1,2,3,4,5);
        System.out.println(l2);
//        l2.add(6);

        Map<String,Integer> l3 = Map.of("张三",10,"a",12);
        System.out.println(l3);

    }

}
