public class Main {
    public static void main(String[] args){
        int n = 100; // 定义int类型变量x，并赋予初始值100
        System.out.println(n); // 打印该变量的值，观察是否为100
        n = 200; // 重新赋值为200
        System.out.println(n); // 打印该变量的值，观察是否为200

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？


    }


}


