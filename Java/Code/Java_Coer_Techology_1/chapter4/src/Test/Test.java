package Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.id = 10;
        fu.show();
        System.out.println(Arrays.equals(new int[]{1,2,3},new int[]{1,2,3}));
    }

}
