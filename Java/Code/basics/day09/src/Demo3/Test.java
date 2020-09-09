package Demo3;

public class Test {
    public static void main(String[] args) {
        MyInterfaceImp imp = new MyInterfaceImp();

        imp.method();
        imp.method2();
        imp.method3();
        imp.defaultMethod();

        MyInterface.staticMethod();
        System.out.println(MyInterface.num);

        MyInterfaceImp2 imp2 = new MyInterfaceImp2();
        imp2.defaultMethod();
    }
}

