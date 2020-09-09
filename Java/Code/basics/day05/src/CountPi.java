public class CountPi {
    public static void main(String[] args) {
        // 计算圆周率
        double pi = 0;

        for (double i = 1,j=0; i < 100000000; i++){

            if (i % 2 != 0) {
                j++;
                if (j % 2 != 0) {
                    pi += (1 / i);
//                    System.out.println(pi);
                } else {
                    pi += (-1 / i);
//                    System.out.println(pi);
                }
            }

        }
//        System.out.println(pi);
        pi = 4 * pi;
        System.out.println(pi);

    }
}
