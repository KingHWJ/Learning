import java.time.LocalDateTime;
import java.util.Date;

public class PrimeNumber {
    // 输出质数
    public static void main(String[] args) {
        /*
        什么样的数才是质数
        1.只有1和其本身两个约数
        2.除了2以为，都是奇数
         */
        int count = 0;

        // 方法1 每个数进行判断
        long start_time1 = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 == 0 && i != 2) {
                continue;
            }
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt <= 2) {
//                System.out.println(i);
                count ++;
            }
        }
        long use_time1 = (System.currentTimeMillis() - start_time1);
        System.out.println(count);
        System.out.println("方法1-总用时：" + use_time1 + "豪秒" );

        // 方法2 设置除尽flag
        count = 1;
        long start_time2 = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true;  // 是否除尽

            // 剔除偶数
            if (i % 2 == 0 && i != 2) {
                continue;
            }

            for (int j = 2; j < i; j++) {

                // 如果除尽了，说明是有其他公约数
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag == true) {
//                System.out.println(i);
                count++;
            }
        }
        long use_time2 = (System.currentTimeMillis() - start_time2);
        System.out.println(count);
        System.out.println("方法2-总用时：" + use_time2 + "豪秒");


        // 方法3 加break （剔除确定是无效的计算）
        count = 1;
        long start_time3 = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true;  // 是否除尽

            // 剔除偶数
            if (i % 2 == 0 && i != 2) {
                continue;
            }

            for (int j = 2; j < i; j++) {

                // 如果除尽了，说明是有其他公约数
                if (i % j == 0) {
                    isFlag = false;
                    break;         // 只对非质数有效
                }
            }
            if (isFlag == true) {
//                System.out.println(i);
                count++;
            }
        }
        long use_time3 = (System.currentTimeMillis() - start_time3);
        System.out.println(count);
        System.out.println("方法2-总用时：" + use_time3 + "豪秒");

        // 方法4 修改数据区间
        count = 1;
        long start_time4 = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true;  // 是否除尽

            // 剔除偶数
            if (i % 2 == 0 && i != 2) {
                continue;
            }

            /*
            不需要小于i，只需奥小于等于根号i就行
            因为公约数就是1个数*1个数，1个数变大，另一个数变小，只要管一边就好，极限就是两个相等
             */
            for (int j = 2; j <= Math.sqrt(i); j++) {

                // 如果除尽了，说明是有其他公约数
                if (i % j == 0) {
                    isFlag = false;
                    break;         // 只对非质数有效
                }
            }
            if (isFlag == true) {
//                System.out.println(i);
                count++;
            }
        }
        long use_time4 = (System.currentTimeMillis() - start_time4);
        System.out.println(count);
        System.out.println("方法4-总用时：" + use_time4 + "豪秒");



        System.out.println("\n--------------------------");
        System.out.println("方法1-总用时：" + use_time1 + "豪秒");
        System.out.println("方法2-总用时：" + use_time2 + "豪秒");
        System.out.println("方法3-总用时：" + use_time3 + "豪秒");
        System.out.println("方法4-总用时：" + use_time4 + "豪秒");


    }
}
