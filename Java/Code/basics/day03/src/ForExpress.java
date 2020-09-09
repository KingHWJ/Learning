public class ForExpress {
    public static void main(String[] args) {
        // for循环
        int i = 0;
        for (i = 1; i < 20; i++) {
            if (i == 10) {
                System.out.println("不需要打印10");
                continue;
            }
            System.out.println(i);

        }
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);

        // while循环
        int x = 1;
        int sumx = 0;
        while (x <= 100) {
            if (x % 2 == 0) {

                sumx += x;
            }
            x++;
        }
        System.out.println(sumx);

        // do_while循环
        int aa = 1;
        do {
            System.out.println("Hello World!");
            aa++;
        } while (1 != 1);

//
//
//
//

    }
}

