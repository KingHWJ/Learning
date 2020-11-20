import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            a.add(rand.nextInt(100));              // add 添加方法
        }
        a.remove(10);                                // remove 删除方法
        System.out.println(a);
        // a.clear();                                      // clear 将集合元素清空
        System.out.println(a.contains(10));                // contains 查看集合中有没有某个元素
        System.out.println(a.isEmpty());                   // isEmpty 判断集合中是否为空
        System.out.println(a.size());                      // size 返回集合中元素的个数

        List<Integer> xx = new ArrayList<>();
        xx.add(999);
        xx.add(111);
        System.out.println(xx);
        a.addAll(xx);                                      // addAll 将一个集合中所有的元素添加到另一个集合中去
        System.out.println(a);
        Iterator<Integer> i = a.iterator();                // 迭代器，集合专用的遍历方式
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // List特有方法
        a.add(0,10000);                      // add(index ,e) 在指定索引位置添加元素
        System.out.println(a);
        System.out.println(a.remove(1));             // remove(index) 删除指定索引的元素，并把删除元素返回
        System.out.println(a.set(0,99999));                // set(index,e)  把指定位置的元素修改为指定的值，并返回当前的值
        System.out.println(a.indexOf(1));                  // indexOf(o) 返回指定元素第一次出现的索引
        System.out.println(a.get(5));                      // get(index) 获取指定索引位置的元素
        ListIterator l = a.listIterator();                 // 列表迭代器
        System.out.println(l.next());

        System.out.println(a.subList(0,5));                // sublist(fromIndex,toIndex) 截取集合
    }
}
