package DataStructures.Array;

public class MyArray {
    // 定义一个数组
    private int[] intArray;
    // 定义数组的实际有效长度
    private int elems;
    // 定义数组的最大长度
    private int length;

    public MyArray() {
        elems = 0;
        length = 50;
        intArray = new int[length];
    }

    /*
    　 ①、如何插入一条新的数据项

    　　②、如何寻找某一特定的数据项

    　　③、如何删除某一特定的数据项

    　　④、如何迭代的访问各个数据项，以便进行显示或其他操作
     */

    // 获取数组有效长度
    public int getSize(){
        return elems;
    }

    public void add(int num){

    }


    public static void main(String[] args) {
        MyArray oneArray = new MyArray();
        System.out.println(oneArray.getSize());
    }
}
