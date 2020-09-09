import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();

        // 添加方法
        map1.put("詹姆斯","小前锋");
        map1.put("邓肯","大前锋");
        map1.put("保罗","控卫");
        map1.put("科比","得分后卫");
        map1.put("张伯伦","中锋");

        map1.put("哈登","得分后卫");

        map1.remove("哈登");

        System.out.println(map1);
        System.out.println(map1.get("张伯伦"));
        System.out.println(map1.get("哈登"));
        System.out.println(map1.containsKey("张伯伦"));

        Set<String> set1 = map1.keySet();
        System.out.println(set1);

        Iterator<String> it = set1.iterator();
        while (it.hasNext()){
            System.out.println(map1.get(it.next()));
        };


        for (String key:set1) {
            System.out.println(map1.get(key));
        };


        Set<Map.Entry<String, String>> set = map1.entrySet();
        System.out.println(set);
        Iterator<Map.Entry<String, String>> it2 = set.iterator();
        while (it2.hasNext()){
            Map.Entry<String,String> entry = it2.next();
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry.getClass());

        }


    }
}
