package InterfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle();
        ComparableCircle c2 = new ComparableCircle();

        c1.setRedius(9);
        c2.setRedius(10);



        System.out.println(c1.compareTo(c2));

    }
}
