import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] a = {1,5,6,3,2};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
