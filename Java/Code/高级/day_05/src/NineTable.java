public class NineTable {
    // 打印99乘法表
    public static void main(String[] args) {
        /*
        1 * 1 = 1
        2 * 1 = 2  2 * 2 = 4
        ...
         */

        for (int i = 1; i <= 9; i++) {      // 行
            for(int j = 1;j <= i;j ++){     // 列
                System.out.printf("%d * %d = %d\t",j,i,i*j);
            }
            System.out.print("\n");
        }

    }
}
