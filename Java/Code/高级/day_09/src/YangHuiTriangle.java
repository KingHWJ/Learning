import java.util.Arrays;

public class YangHuiTriangle {
    public static void main(String[] args) {
        /*
         杨辉三角
         1.第一行，1个元素，第n行，n个元素
         2.每一行第一个元素，和最后一个元素都是1
         3.从第三行开始
        */

        show(10);
    }

    public static void show(int n) {

        int[][] arr = new int[n][];

        for (int row = 0; row < n; row++) {             // 行
            arr[row] = new int[row+1];
            for (int col = 0; col <= row; col++) {         // 列
                // 设置第一个，和最后一个元素
                if (col == 0 || col == row) {
                    arr[row][col] = 1;
                }else if(row >= 2){
                    arr[row][col] = arr[row -1][col] + arr[row-1][col-1];
                }
            }
        }
        for (int[] ints : arr) {
            for (int ints1 : ints) {
                if(ints1 == 0){
                    break;
                }
                System.out.print(ints1 + "\t");
            }
            System.out.println("");
        }
    }
}
