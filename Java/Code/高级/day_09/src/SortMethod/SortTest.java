package SortMethod;

import java.util.ArrayList;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        // 排序算法测试 ，生成一个10000个数的数组
        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 1500; i++) {
            arr.add(r.nextInt(10000000));
        }
        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();
        ArrayList<Integer> arr3 = (ArrayList<Integer>) arr.clone();

        // 三大算法排序
        System.out.println("冒泡排序-----------------------------");
        BubbleSort.sort(arr);
        System.out.println("插入排序-----------------------------");
        InsertSort.sort(arr2);
        System.out.println("选择排序-----------------------------");
        SelectionSort.sort(arr3);


    }
}
