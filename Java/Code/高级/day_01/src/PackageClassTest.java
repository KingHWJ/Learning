public class PackageClassTest {
    // 包装类
    public static void main(String[] args) {
        /*
        byte    ---->  Byte
        char    ---->  Character
        short   ---->  Short
        int     ---->  Integer
        long    ---->  Long
        float   ---->  Float
        double  ---->  Double
        boolean ---->  Boolean
         */
        // 装箱 与 拆箱
        Integer in2 = new Integer(4);
        Integer in3 = Integer.valueOf(10);
        System.out.println(in2);

        int num = in2.intValue();
        System.out.println(num);

        // 自动装箱 与 自动拆箱
        Integer in = 1;
        System.out.println(in);
        in += 2;
        System.out.println(in);
        Integer.valueOf(10);

        // 基本类型 --->  字符串

        String x = 100 +"";
        System.out.println(x);

        String y = Integer.toString(100) + 200;
        System.out.println(y);

        String z = Double.toString(10.2) + -10.2;
        System.out.println(z);

        String xx = String.valueOf(10) + 200;
        System.out.println(xx);

        // 字符串 ---> 基本类型
        int intx = Integer.parseInt(x);
        System.out.println(intx);

//        double dd = Double.parseDouble("a");  java.lang.NumberFormatException  格式不匹配
        double dd = Double.parseDouble(xx);
        System.out.println(dd);




    }
}
