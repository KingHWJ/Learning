package ErrorAndException;

import java.util.Date;
import java.util.concurrent.atomic.DoubleAdder;

public class someKindException {
    public static void main(String[] args) {
//        indexOutExp();
//        nullRef();
//        divideZero();
//        classCast();
    }

    // 索引越界
    public static void indexOutExp() {
        String friends[] = {"lisa", "bily", "kessy"};
        for (int i = 0; i < 5; i++) {
            System.out.println(friends[i]); // friends[4]? }
            System.out.println("\nthis is the end");
        }
    }

    // 空指针异常
    public static void nullRef() {
        class NullRef{
            int i = 1;
        }
        NullRef t = new NullRef();
        t = null;
        System.out.println(t.i);
    }

    // 算术异常
    public static void divideZero(){
        int x = 0;
        int y;
        y = 10 /x;
        System.out.println(y);
    }

    // 类型转换异常
    public static void classCast(){
        Object obj = new Date();
        DoubleAdder test;
        test = (DoubleAdder)obj;
        System.out.println(test);
    }

}

