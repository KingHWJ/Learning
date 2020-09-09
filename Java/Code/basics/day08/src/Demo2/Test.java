package Demo2;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        Zi zi = new Zi();

        System.out.println(fu.num);
        System.out.println(zi.num);

        fu.methodFu();
        zi.methodFu();
        zi.methodZi();

        System.out.println("--------");

        fu.method();
        zi.method();


    }
}
