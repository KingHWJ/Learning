package SortMethod;

import java.util.ArrayList;

// 冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(9);
        arr.add(1);
        arr.add(5);
        arr.add(10);
        arr.add(16);
        arr.add(-3);
        arr.add(-5);
        arr.add(-100);
        arr.add(-7);

        System.out.println("排序前的数组：" + arr);
        System.out.println("排序后的数组：" + sort(arr));

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arr){
//        System.out.println("排序前的数组：" + arr);
        int step = 0;

        /*
        1.若有n个元素，最坏情况下，需要进行n轮循环
        2.每轮循环，两个指针，相互比较，若左大，右小，交换位置，两个指针向右平移
         */
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int temp = 0;
                if(arr.get(i) > arr.get(j)){
                    step ++;
                    // 交换位置
                    temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                    step++;
                }
            }
        }
        long use_time = System.currentTimeMillis() - start_time;
//        System.out.println("排序后的数组：" + arr);
        System.out.println("排序用时：" + use_time + "毫秒" + "   总共步数：" + step + "布");
        return arr;
    }
}
