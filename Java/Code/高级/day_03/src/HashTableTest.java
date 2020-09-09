public class HashTableTest {
    public static void main(String[] args) {

        Person p1 = new Person("詹姆斯",25);
        Person p2 = new Person("詹姆斯",25);
        Person p3 = new Person("乔丹",34);

        System.out.println("equals方法-------------");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        System.out.println("hashCode方法-----------");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

    }
}
