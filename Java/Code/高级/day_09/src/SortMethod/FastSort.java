package SortMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 快速排序
public class FastSort {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(new Random().nextInt(1000));
        }

        System.out.println("排序前的数组：" + arr);
        System.out.println("排序后的数组：" + arr);


    }

    /*
    1.设置左右两个指针
    2.选择最左边的一个数为轴
    3.左指针往右移动，寻找比轴更大的数，如果指针的数，小于轴，指针右移一格，如果大于，则停住，切换指针
    4.右指针往左移动，寻找比轴更小的数，如果指针的数，大于轴，指针左移一格，如果小于，则停住，切换指针
    5.如果左指针和右指针重合，或者右指针小于左指针，则将左指针和轴的数，交换位置
    6.按轴分割数组，进行递归操作
     */
    public static void sort(ArrayList<Integer> arr, int left, int right) {
        int l = left;                  // 左指针
        int r = right;     // 右指针
        int pox = arr.get((l + r)/2);       // 轴

        while (l < r) {
            // 在左边一直找到小于pox的数，跳出条件，i对应的指针是大于pox的数
            while (arr.get(l) < pox) {
                l++;
            }
            // 在右边一直找到大于pox的数，跳出条件，j对应的指针是小于pox的数
            while (arr.get(r) > pox) {
                r--;
            }

            // 如果左指针和右指针重合，或者交错，说明原顺序就是正确的
            if (l >= r) {
                break;
            }

            // 找到之后，交换
            int temp = arr.get(l);
            arr.set(l, pox);
            arr.set(r, temp);
        }


    }
}
