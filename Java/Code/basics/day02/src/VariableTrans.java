public class VariableTrans {
    public static void main(String[] args) {
//        隐式转换
//        数据范围小的往大的转化
        double d1 = 3.23F;
        System.out.println(d1);

        long l1 = 300000;
        System.out.println(l1);

        // 显示转换，强制转化
        // 数据范围大的往小的转化，不能自动转化完成，需要自己强制置换
        float f1 = (float) 3.2223;
        System.out.println(f1);

        int i1 = (int)3000L;
        System.out.println(i1);     // 如果大范围的数据没有超过小范围的数据范围，则没有关系
        // 但是一般情况下，会造成数据精度的丢失

        int i2 = (int)100000000000L;  // 1215752192 数据精度丢失
        System.out.println(i2);

        char a1 = 'A';
        System.out.println(a1);
        System.out.println(a1+1);

        byte b1 = 50;
        byte b2 = 60;
        long result1 = b1 + b2;
        System.out.println(result1);

        char a2 = '1';
        System.out.println(a2+1);
    }
}
