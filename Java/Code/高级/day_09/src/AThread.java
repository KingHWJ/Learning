public class AThread extends Thread {

    static int num = 1;

    @Override
    public void run() {
        System.out.println("我是第" + num + "个：一个子线程");
        num++;
    }
}
