package Thread01;

public class Thread03Test {
    public static void main(String[] args) {
        Thread03 r = new Thread03();
        Thread03Imp r2 = new Thread03Imp();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我是主线程：" + i);

        }
    }
}
