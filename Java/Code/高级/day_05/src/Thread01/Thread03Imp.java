package Thread01;

public class Thread03Imp implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("当前线程" + Thread.currentThread()+ i);
        }
    }
}
