public class TranSquare {
    public static void main(String[] args) {
        printx();
    }
    // 打印长方形
    private static void printx(){
        for(int i=0;i<=6;i++){
            for(int j=0;j<=20;j++){
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
