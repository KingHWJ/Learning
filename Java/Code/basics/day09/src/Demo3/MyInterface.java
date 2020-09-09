package Demo3;

public interface MyInterface {

    // 接口抽象方法
    public abstract void method();

    public  void method2();

    void method3();

    // 添加默认方法，可以方便升级
    default void defaultMethod(){
        System.out.println("我是默认方法！");
        privateMethod();
        privateStaticMethod();
    }

    // 接口定义一个静态方法
    public static void staticMethod(){
        System.out.println("这是接口的一个静态方法！");
    }

    // 普通私有方法
    private void privateMethod(){
        System.out.println("这是一个普通的私有方法！");
    }

    // 静态私有方法
    private static void privateStaticMethod(){
        System.out.println("这是一个静态私有方法");
    }

    // 静态成员变量
    public static final int num = 10;

}
