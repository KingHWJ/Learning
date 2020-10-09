package SortMethod;

import java.util.ArrayList;

public class InsertSort {
    // 插入排序

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
        1、假设开头的元素，已排好顺序
        2、从第二个元素开始，依次向后扫描
        3、如果发现新元素，小于最开始的元素，则将该元素放在最左边
         */
//        System.out.println("排序前的数组：" + arr);
        int step = 0;
        long start_time = System.currentTimeMillis();
        // 从第二个元素开始
        for (int i = 1; i < arr.size(); i++) {

            int position = i;           // 需要插入数据的索引
            int tmp = arr.get(position);

            while (position > 0 && arr.get(position - 1) > tmp){
                arr.set(position,arr.get(position-1));
                position --;
                step++;
            }
            arr.set(position,tmp);
            step++;

            // 从后向前扫描  待比较的数
//            for (int j = i - 1; j >= 0; j--) {
//                // 如果待插入数据，小于已排好序的数据，则将待排序的数据，向右移动一格
//                // if(待比较的数 > 插入的数) 则 (待比较的数右移一位，插入的数放在他的位置） 重复往前比较，直到待比较的数到0
//                if (arr.get(j) > arr.get(position)) {
//                    step ++;
//                    int temp = arr.get(position) ;
//                    arr.set(position, arr.get(j));       // 向右移动一格
//                    arr.set(j, temp);                    // 将数据插入到这个位置
//                    position = j;                        // 待插入数组的 位置插到该位置
//                    step ++;
//                }
//            }

        }


        long use_time = System.currentTimeMillis() - start_time;
//        System.out.println("排序后的数组：" + arr);
        System.out.println("排序用时：" + use_time + "毫秒" + "   总共步数：" + step + "布");
        return arr;
    }
}
