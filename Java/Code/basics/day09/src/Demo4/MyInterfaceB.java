package Demo4;

public interface MyInterfaceB {

    abstract void methodB();
    public default void methodDefault(){
        System.out.println("这是接口A的默认方法");
    }

    static void methodStatic(){
        System.out.println("这是接口B的静态方法");
    }
}
