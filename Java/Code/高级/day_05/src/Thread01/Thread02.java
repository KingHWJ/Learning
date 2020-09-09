package Thread01;

public class Thread02 extends Thread{

    @Override
    public void run() {
        // System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println("我是子线程：" + i);
        }

    }
}
