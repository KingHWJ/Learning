package ThreadSecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {

    private int ticket_cnt = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // 上锁
        while (ticket_cnt >0) {
            lock.lock();
            if (ticket_cnt > 0) {
                // 增加出错概率x`
                try {
                    Thread.sleep(5);
                    System.out.printf("%s线程，正在卖第%d张票\n", Thread.currentThread().getName(), ticket_cnt);
                    ticket_cnt--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放锁
                    lock.unlock();
                }
            }else{
                System.out.println("票卖完了");
                return;
            }

        }

    }
}
