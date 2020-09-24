public class LambadaExpression {
    /*lambda表达式（Java 8 新特性）
    概念：函数作为参数，传递给方法
    格式：
        1、无参数，无返回值
        2、有参数，有返回值

    */
    public static void main(String[] args) {


        new Thread(() -> {
            System.out.println("创建一个线程");
        }).run();
    }
}
