public class StringType {
    // 字符串类型
    public static void main(String[] args) {

        String a = "abc";
        String b = "456";

        String[] c = {"a",a,b,"10"};
        System.out.println(c[1]);

    }

    public static void change(String[] x){
        x[0] = "hello";
    }
}
