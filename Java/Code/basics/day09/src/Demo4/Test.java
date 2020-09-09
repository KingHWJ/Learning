package Demo4;

public class Test {
    public static void main(String[] args) {
        InterfaceImplent i = new InterfaceImplent();
        i.methodA();
        i.methodB();
        i.methodDefault();

        MyInterfaceB.methodStatic();
        MyInterfaceA.methodStatic();
    }


}
