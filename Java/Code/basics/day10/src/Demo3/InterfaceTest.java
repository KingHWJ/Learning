package Demo3;

public class InterfaceTest {
    public static void main(String[] args) {

//        MyInterfaceImp obj = new MyInterfaceImp();
//        obj.method();

        // 多态写法
        MyInterface obj = new MyInterfaceImp();
        obj.method();

        // 格式 接口名称 对象名 = new 接口名称() {...}
        // 匿名内部类
        MyInterface obj2 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类，重写了接口的方法！");
            }
        };
        obj2.method();

        // 匿名对象
        new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名对象，重写了接口的方法！");
            }
        }.method();
    }
}
