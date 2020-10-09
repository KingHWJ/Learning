public class InterviewTest {

    public static void main(String[] args) {
        test3();
    }

    public static void test1(){
        Object o1 = true?new Integer(1):new Double(2.0);        // 三元运算符，会统一类型
        System.out.println(o1);
    }

    public static void test3(){
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        System.out.println(x == y);

        Integer xx = 1;
        Integer yy = 1;
        System.out.println(xx == yy);

        Integer xxx = 127;
        Integer yyy = 127;
        System.out.println(xxx == yyy);
    }
}
