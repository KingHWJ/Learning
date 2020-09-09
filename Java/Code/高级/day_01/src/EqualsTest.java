import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {
        Person p = new Person("古力娜扎",20);
        Person p2 = new Person("马尔扎哈",300);
        Person p3 = new Person();
        Person p4 = new Person("马尔扎哈",300);


        System.out.println(p.equals(p2));
        System.out.println(p.equals(p3));
        System.out.println(p2.equals(p4));
        System.out.println(Objects.equals(p2,p4));
    }
}
