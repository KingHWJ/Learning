public class MathTest {
    // 计算在-10.8~5.9之间绝对值大于6或者绝对值小于2.1的整数有多少个
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int cnt = 0;
        for (int i = (int) min; i < (int) max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.println(i);
                cnt++;
            }
        }

        System.out.printf("总共有：%d个",cnt);
    }
}



