import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashCodeDefine {
    public static void main(String[] args) {

        Map<String,Person> map1 = new HashMap<>();

        map1.put("美国",new Person("詹姆斯",35));
        map1.put("中国",new Person("姚明",40));
        map1.put("英国",new Person("JK",38));
        map1.put("德国",new Person("诺维斯基",38));

        System.out.println(map1);

        Set<String> set = map1.keySet();
        for (String key :set) {
            Person p = map1.get(key);
            System.out.println(key + ":" + p.getName() + ":" + p.getAge());
        }

        Map<Person,String> map2 = new HashMap<>();
        map2.put(new Person("詹姆斯",35),"美国");
        map2.put(new Person("姚明",40),"中国");
        map2.put(new Person("JK",38),"英国");
        map2.put(new Person("诺维斯基",38),"德国");
        map2.put(new Person("诺维斯基",38),"美国");

        System.out.println(map2);

        Set<Map.Entry<Person,String>> set2 = map2.entrySet();
        Iterator<Map.Entry<Person,String>> it = set2.iterator();
        while (it.hasNext()){
            Map.Entry<Person, String> next = it.next();
            Person key = next.getKey();

            String val = next.getValue();
            System.out.println(key + ":" + key.getName() + ":" + key.getAge() + ":" + val);

        }



    }
}
