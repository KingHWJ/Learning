package Demo4;

public class InterfaceImplent implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("这是接口A的方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("当来自多个接口的默认方法，需要重写默认方法");
    }

    @Override
    public void methodB() {
        System.out.println("这是接口B的方法");

    }

}
