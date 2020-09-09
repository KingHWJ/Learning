import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        // currentTimeMiles 计算当前时间的毫秒值
        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis() - time1;

        System.out.println("总共用时" + time2 + "毫秒");
        System.out.println("总共用时" + time2/1000 + "秒");


        // arrayCopy(源数组，开始位置，目标数组，开始位置，复制长度)
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10};

        System.out.println("复制前：" + Arrays.toString(a2));
        System.arraycopy(a1,1,a2,2,3);
//        System.arraycopy(a1,1,a2,4,3);    超出数组长度会报错

        System.out.println("复制后：" + Arrays.toString(a2));

    }
}
