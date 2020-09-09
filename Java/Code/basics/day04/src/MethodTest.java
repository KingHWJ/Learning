public class MethodTest {
    // 方法调用
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(getsum(x,y));
        printx();
        System.out.println(comparenum(x,y));
        System.out.println(sum100());
        printn(2);
    }

    public static int getsum(int a,int b){
        return a + b;
    }

    public static void printx(){
        System.out.println("我就是想打印点东西");
    }

    public static boolean comparenum(int a,int b){

        if(a > b){
            System.out.println("大于");
            return true;
        }else{
            System.out.println("小于");
            return false;
        }
    }

    // 计算1-100的和
    public static int sum100(){
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum += i;
        }
        return sum;
    }

    // 不规定次数打印
    public static void printn(int n){
        for(int i =1 ;i <= n ;i++){
            System.out.println("Hello World!");
        }
//        System.out.println(i);  // i已经不可以再被引用了
    }
}
