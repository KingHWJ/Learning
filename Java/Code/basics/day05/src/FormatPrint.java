public class FormatPrint {
    // 格式化输出
    public static void main(String[] args) {
        double d = 3.141592653;
        var a = 220;

        System.out.printf("%.2f\n",d);
//        System.out.println("");
        System.out.printf("%03d\n",a);
        System.out.printf("%08x\n",a);


    }
}
