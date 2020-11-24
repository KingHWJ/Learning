package DataStructures.Array;

// 稀疏数组

import java.util.ArrayList;
import java.util.Arrays;

public class SparseArray {

    private int row;     // 行
    private int col;     // 列
    private int[][] array;

    // 稀疏数组构造函数
    public SparseArray(int val_cnt) {
        array = new int[val_cnt + 1][3];
    }

    public SparseArray() {
    }

    // 二维数组转为稀疏数组
    public static int[][] convert(int[][] array) {
        // 计算原数组有效个数
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {                // 行索引
            for (int j = 0; j < array[i].length; j++) {         // 列索引  每一行的数据
                if (array[i][j] != 0) {
                    cnt++;
                }
            }
        }
        // 存储第一行数据  [原数组的行，原数组的列，原数组的有效字段
        SparseArray sparseArray = new SparseArray(cnt);
        sparseArray.array[0] = new int[]{array.length, array[0].length, cnt};

        int row = 1;
        // 存储有效数据
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    sparseArray.array[row][0] = i;
                    sparseArray.array[row][1] = j;
                    sparseArray.array[row][2] = array[i][j];
                    row++;
                }
            }
        }
        return sparseArray.array;
    }

    // 稀疏数组转为二维数组
    public static int[][] load(int[][] sparsearray) {
        int row = sparsearray[0][0];
        int col = sparsearray[0][1];

        // 读取稀疏数组第一行，创建新的二维数组
        int[][] array = new int[row][col];

        // 依次给原数组设置为0值
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = 0;
            }
        }
        // 设置有效值
        for (int i = 1; i < sparsearray.length; i++) {
            array[sparsearray[i][0]][sparsearray[i][1]] = sparsearray[i][2];
        }
        return array;
    }

    public static void show(int[][] array) {
        for (int[] rowInts : array) {
            for (int data : rowInts) {
                System.out.printf("%d\t", data);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][3] = 2;
        array[7][9] = 5;

        System.out.println("原二维数组———————————————————————————");
        show(array);

        int[][] sparseArray = convert(array);
        System.out.println("稀缺数组————————————————————————————");
        show(sparseArray);

        int[][] old_array = load(sparseArray);
        System.out.println("加载稀缺数组转换为原二维数组————————————");
        show(old_array);
    }
}
