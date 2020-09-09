public class ArrayException {
    // 数组异常
    public static void main(String[] args) {
        int[] ary1 = {1,2,3,4,5};
        System.out.println(ary1[5]);
        ary1 = null;
        System.out.println(ary1[0]);

    }
}
