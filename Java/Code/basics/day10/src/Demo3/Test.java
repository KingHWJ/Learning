package Demo3;

public class Test {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = new Outer().new Inner();
//        inner.method();
//        out.inner.method();
        out.method();
    }
}
