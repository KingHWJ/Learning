public class ArrayParam {
    // 数组作为参数
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        printarry(x);

        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a, b);
        System.out.println(a);
        System.out.println(b);

    }

    public static void printarry(int[] arry){
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }

    public static void change(int x,int y){
        x = x + y;
        y = y + x;
    }
}
