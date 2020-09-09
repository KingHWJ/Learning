public class CharandString {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);

        int i1 = c1;
        int i2 = c2;
        System.out.println("A的Unicode编码为：" + i1);
        System.out.println("中的Unicode编码为：" + i2);
    }
}
