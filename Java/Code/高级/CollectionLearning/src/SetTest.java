import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        new HashSetTest().Test();
    }
}


class HashSetTest{
    public void Test(){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add(new Random().nextInt(10));
        }
        System.out.println(hashSet);            // hashset取出顺序和插入时的顺序不一致
    }
}