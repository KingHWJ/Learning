public class MethodReload {
    // 方法重载
    public static void main(String[] args) {
        getsum(1,2);
        getsum(2.0,2);
        getsum(12,12);
        getsum(2.5,3.5);
        getsum1((short)2,(short)2);


    }

    // 两个byte类型
    public static boolean getsum(byte a,byte b){
        System.out.println("byte类型");
        return a == b;
    }

    // 两个short类型
    public static boolean getsum1(short a,short b){
        System.out.println("short类型");
        return a == b;
    }

    // 两个int类型
    public static boolean getsum(int a,int b){
        System.out.println("int类型");
        return a == b;
    }

    // 两个double类型
    public static boolean getsum(double a,double b){
        System.out.println("byte类型");
        return a == b;
    }

    // 1个double类型 1个int类型
    public static boolean getsum(double a,int b){
        System.out.println("double和int类型");
        return a == b;
    }
}
