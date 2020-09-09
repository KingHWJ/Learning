package Thread01;

public class Thread02Test {
    public static void main(String[] args)  {
        Thread02 t = new Thread02();
        t.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("我是主线程：" + i);

        }


    }
}
