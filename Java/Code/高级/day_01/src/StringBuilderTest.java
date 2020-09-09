public class StringBuilderTest {
    public static void main(String[] args) {
        // String ---> StringBuilder
        StringBuilder str1 = new StringBuilder("abc");

        System.out.println(str1);

        StringBuilder str2 = str1.append(10);
        System.out.println(str2);
        System.out.println(str1);
        System.out.println(str1 == str2);

        // append 方法后，返回的还是这个对象，所以可以使用链式编程
        str1.append(10).append("中").append('国').append(false);
        System.out.println(str1);

        // StringBuilder ---> String
        String str3 = str1.toString();
        System.out.println(str3);
        System.out.println(str3.length());

    }
}
