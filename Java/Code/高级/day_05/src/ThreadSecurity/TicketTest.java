package ThreadSecurity;

// 售票系统
public class TicketTest {
    public static void main(String[] args) {

//        Runnable r = new SellTicket();
    // 枷锁了
//        Runnable r = new SameCodeBlock();
        // 同步方法
        Runnable r = new SameCodeMethod();
        System.out.println(r);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();


    }
}
