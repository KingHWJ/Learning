package Algorithms.ClassicalProblems;

import java.util.ArrayList;
import java.util.Scanner;


/*
汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。
大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。
大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。
并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。

后来，这个传说就演变为汉诺塔游戏，玩法如下:
1.有三根杆子A,B,C。A杆上有若干碟子
2.每次移动一块碟子,小的只能叠在大的上面
3.把所有碟子从A杆全部移到C杆上
 */
public class Tower {

    public static int times;    // 移动次数

    public static void move(int disk, char old, char now) {
        System.out.println("第" + (++times) + "移动，盘子" + disk + old + "---->" + now);
        // 前++ 先计算，后赋值 ； 后++ 先赋值，后计算
    }


    public static void tower(int n, char A, char B, char C) {
        if (n == 1) {
            move(n, A, C);
        } else {
            tower(n - 1, A, C, B);
            move(n, A, C);
            tower(n - 1, B, A, C);
        }
    }


    public static void main(String[] args) {
        char A = 'A';
        char B = 'B';
        char C = 'C';
//        System.out.println("汉诺塔游戏开始啦");
//        System.out.println("请输入盘子数：");
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            times = 0;
            long start_time = System.currentTimeMillis();
            //调用汉诺塔
            tower(i, A, B, C);
            long use_time = System.currentTimeMillis() - start_time;
            System.out.println(i + "层汉诺塔共移动" + times + "次，共用时：" + use_time + "毫秒");
            System.out.println("------------------");
        }
    }
}
