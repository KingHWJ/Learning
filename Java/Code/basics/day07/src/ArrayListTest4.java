import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest4 {
    // 生成6个1~33的数字放进集合，并遍历

    public static void main(String[] args) {
        ArrayList<Integer> rand = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            rand.add(r.nextInt(33)+1);

        }
        System.out.println(rand);

        for (int i = 0; i < rand.size(); i++) {
            System.out.println(rand.get(i));
        }
    }
}
