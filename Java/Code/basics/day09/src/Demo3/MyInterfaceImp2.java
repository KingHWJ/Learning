package Demo3;

public class MyInterfaceImp2 implements MyInterface{
    @Override
    public void method() {
        System.out.println("我是B类，这是方法1");
    }

    @Override
    public void method2() {
        System.out.println("我是B类，这是方法2");

    }

    @Override
    public void method3() {
        System.out.println("我是B类，这是方法3");

    }

    @Override
    public void defaultMethod() {
        System.out.println("我是B类，我重写了默认方法");
    }
}
