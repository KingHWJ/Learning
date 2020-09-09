public class SiZeYunSuan {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a+b);

        long c = 2000L;
        int d = 22;
        System.out.println(c+d);

        double e = 2.7;
        System.out.println(e+c);

        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        ++num1;
        System.out.println(num1);

        int num2 = 20;
        System.out.println(num2);   // 20
        int result1 = num2++;
        System.out.println(result1);    //  20
        System.out.println(num2);       //  21
        int result2 = ++num2;
        System.out.println(result2);  // 22
        System.out.println(num2);  // 22



    }
}
