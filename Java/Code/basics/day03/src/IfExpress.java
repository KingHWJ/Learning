public class IfExpress {
    //    if 逻辑判断语句
    public static void main(String[] args) {
        System.out.println("开始");
        int a = 10;
        int b = 20;
//        System.out.println(a==b?a:b);
        if (a == b) {
            System.out.println("a等于b");
        }
        int c = 20;
        if (b == c) {
            System.out.println("b等于c");
        }
        // if  else
        if (a % 2 == 0) {
            System.out.println("a是偶数");
        } else {
            System.out.println("a是奇数");
        }

        // if else if else
        // x和y的关系满足如下:
        // x>=3 y = 2x + 1;
        //‐1<=x<3 y = 2x;
        // x<=‐1 y = 2x – 1;
        // 根据给定的x的值，计算出y的值并输出。 // 定义变量
        int x = -2;
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x < 3 && x >= -1) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println(x);
        System.out.println(y);


        // 综合
        int score = 78;
        if(score<60){
            System.out.println("不及格");
        }else if(score <= 69){
            System.out.println("及格");
        }else if(score <= 79){
            System.out.println("良");
        }else if(score <= 89){
            System.out.println("好");
        }else{
            System.out.println("优秀");
        }

        int xx = 100;
        int yy = 200;
        c  = xx > yy ? xx : yy;
        System.out.println(c);



    }
}
