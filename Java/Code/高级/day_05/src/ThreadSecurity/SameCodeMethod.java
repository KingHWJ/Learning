package ThreadSecurity;

// 线程安全问题，方法
public class SameCodeMethod implements Runnable {
    // 创建共享资源
    static private int ticket_cnt = 100;

    // 创建一个锁对象
    Object obj = new Object() ;


    @Override
    public void run() {
        System.out.println(this);

        while (true) {
            sellTicket();
        }

    }

    public synchronized void sellTicket(){
        synchronized (obj){

            if(ticket_cnt > 0){
                // 增加出错概率x`
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("%s线程，正在卖第%d张票\n", Thread.currentThread().getName(), ticket_cnt);
                ticket_cnt--;
            }

        }
    }
}