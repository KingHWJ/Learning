import java.util.Arrays;

public class MaoPao {
    // 冒泡排序算法
    public static void sort(int[] array) {
        int cnt = 0;        // 步长统计
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                cnt++;      // 比较一次
                if (array[i] > array[j]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    cnt++;  // 交换一次
                }
            }
        }
        System.out.println(array);
    }

    public static void main(String[] args) {
        int[] l = new int[]{5,4,3,2,1};
        sort(l);
        for (int i : l) {
            System.out.println(l);
        }
    }

}
