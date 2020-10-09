package SortMethod;

import java.util.ArrayList;

// 冒泡排序
public class SelectionSort {
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

    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {

        /*
        1.首先指定0位置的元素为最小
        2.然后进行比较，如果发现某个更小的，指定其索引
        3.完成一轮循环，最小元素和首元素进行交换
         */
//        System.out.println("排序前的数组：" + arr);
        int step = 0;
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < arr.size(); i++) {
            int temp = 0;
            int min_index = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) < arr.get(min_index)){
                    step ++;
                    min_index = j;
                }
            }

            // 如果最小的数就是第一个，就不用换
            if(min_index != i){
                temp = arr.get(min_index);
                arr.set(min_index,arr.get(i));
                arr.set(i,temp);
                step ++;
            }


        }


        long use_time = System.currentTimeMillis() - start_time;
//        System.out.println("排序后的数组：" + arr);
        System.out.println("排序用时：" + use_time + "毫秒" + "   总共步数：" + step + "布");
        return arr;
    }
}
