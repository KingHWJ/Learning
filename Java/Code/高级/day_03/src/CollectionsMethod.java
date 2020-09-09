import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsMethod {
    // Collections集合常用方法
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(1);
        list.add(12);
        list.add(100);
        System.out.println(list);

        Collections.addAll(list,1,2,3,4,5,6);  // 往集合中添加一些元素
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list);

        Person p1 = new Person("周杰伦",28);
        Person p2 = new Person("刘德华",38);
        Person p3 = new Person("周润发",25);
        Person p4 = new Person("张惠妹",22);

        ArrayList<Person> list2 = new ArrayList<>();
        Collections.addAll(list2,p1,p2,p3,p4);

        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        // 将集合中的元素按指定规则排序
        Collections.sort(list2, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result =  o1.getAge() - o2.getAge();
                if(o1.getAge()-o2.getAge() == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });

    }
}
