package ThreadSecurity;

public class SellTicket implements Runnable {

    // 创建共享资源
    static private int ticket_cnt = 200;


    @Override
    public void run() {

        while (ticket_cnt > 0){
            // 增加出错概率
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s线程，正在卖第%d张票\n",Thread.currentThread().getName(),ticket_cnt);
            ticket_cnt --;

        }


    }
}
