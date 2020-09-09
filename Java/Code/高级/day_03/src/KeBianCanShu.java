public class KeBianCanShu {
    public static void main(String[] args) {

        add(10,20);
        add2("杭文杰",10,new Person());
    }

    public static void add(int...list){
        System.out.println(list);
        System.out.println(list.length);

    }

    public static void add2(String name,Object...list){

        System.out.println(name);
        System.out.println(list);
        for (Object o : list) {
            System.out.println(o);

        }
    }
}
