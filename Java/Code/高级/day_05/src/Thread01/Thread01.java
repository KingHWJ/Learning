package Thread01;

/*
多线程类，要继承Thread
 */
public class Thread01 extends Thread{

    public Thread01() {
    }

    public Thread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 20; i++) {

            System.out.println("我作为一个线程在运行了" + i + "次");
        }
    }

}
