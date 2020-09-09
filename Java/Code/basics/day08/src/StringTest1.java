public class StringTest1 {
    // 创建字符串的3+1种类型
    /*
     * 字符串类型的构造方法
     * 1.public String()                直接构造一个空字符串
     * 2.public String(char[] array)
     * 3.public String(byte[] array)
     *
     * 直接创建
     * String str = "hello"
     * */
    public static void main(String[] args) {

        // 构造方法1
        String str1 = new String();
        System.out.println("这是一个字符串："+ str1);

        // 构造方法2
        char[] c1 = {'a','b','c'};
        String str2 = new String(c1);
        System.out.println("这是一个字符串："+ str2);

        // 构造方法3
        byte[] b1 = {80,90,126};
        String str3 = new String(b1);
        System.out.println("这是一个字符串：" + str3);

        // 直接构造
        String str4 = "hello";
        System.out.println(str4);
    }
}
