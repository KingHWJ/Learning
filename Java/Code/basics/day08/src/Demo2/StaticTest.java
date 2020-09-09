package Demo2;

public class StaticTest {
    // 定义一个静态变量
    static int a = 100;

    int b = 200;

    public void method(){
        System.out.println("我是成员方法----");
        System.out.println("这是一个静态变量："+a);
        System.out.println("这是一个成员变量："+b);
        System.out.println("--------------");
    }

    public static void method2(){
        System.out.println("我是静态方法----");
        System.out.println("这是一个静态变量："+a);
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        StaticTest s = new StaticTest();
        s.method();
        StaticTest.method2();
    }
}


