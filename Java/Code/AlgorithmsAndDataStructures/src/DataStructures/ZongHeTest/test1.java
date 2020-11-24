package DataStructures.ZongHeTest;

import DataStructures.Array.BasicArray;
import DataStructures.Array.SparseArray;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {


        int[][] array = new int[100][50];

        for (int i = 0; i <10; i++) {
            array[new Random().nextInt(100)][new Random().nextInt(50)] = new Random().nextInt(100);
        }

//        SparseArray.show(array);

        int[][] a = SparseArray.convert(array);
        System.out.println("----------");
        SparseArray.show(a);

        SparseArray.show(SparseArray.load(a));
    }
}
