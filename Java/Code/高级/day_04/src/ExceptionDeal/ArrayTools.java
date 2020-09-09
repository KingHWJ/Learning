package ExceptionDeal;

import java.util.Objects;

public class ArrayTools {
    public static int getElement(int[] arr,int index){
        if(index < 0 || index > arr.length -1){
            throw new ArrayIndexOutOfBoundsException("索引，超出异常");
        }

        int element = arr[index];
        return element;
    }

    public static void method(Object obj){
//        if(obj == null){
//            throw new NullPointerException("这是一个空指针！");
//        }
        Objects.requireNonNull(obj,"这是一个空指针");
    }
}
