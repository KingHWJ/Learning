public class Arrayparamers {
    // 数组作为参数
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(arr[0]);     // 1
        change(arr);
        System.out.println(arr[0]);     // 200

        var a = 102.23;
        System.out.println(a);

        var c = "a \n" +
                "b \n" +
                "c \n";
        System.out.println(c);

    }

    public static void change(int[] args){
        args[0] = 200;
    }
}
