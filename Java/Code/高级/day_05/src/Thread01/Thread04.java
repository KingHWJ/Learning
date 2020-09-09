package Thread01;

// 使用匿名内部类
public class Thread04 {
    public static void main(String[] args) {

        // Thread类
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("这是B子线程" + i);

                }
            }
        }.start();

        // Runnable接口
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 20; i++) {
                            System.out.println("这是A子线程" + i);
                        }
                    }
                }).start();
    }
}
