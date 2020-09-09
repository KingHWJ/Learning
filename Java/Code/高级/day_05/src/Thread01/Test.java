package Thread01;

public class Test {
    public static void main(String[] args) {

        Thread01 t1 = new Thread01();
        Thread01 t2 = new Thread01("小强");
        t1.setName("旺财");
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread());

        System.out.println(t1.getName());   // Thread-0

        for (int i = 0; i <20; i++) {
            System.out.println("我作为一个主线程在运行了" + i + "次");
        }
    }
}
