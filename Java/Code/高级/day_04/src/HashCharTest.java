import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashCharTest {
    public static void main(String[] args) {
        // 通过系统输入的字符，判断有多少个字符了
        System.out.print("请输入一个字符串：");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        // 定义Map集合
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer val = map.get(c);
                val++;
                map.put(c, val);

            } else {
                map.put(c, 1);
            }
        }
        // keySet 转换成set集合
        for (Character key:map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
