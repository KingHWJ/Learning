import java.util.Arrays;

public class MaoPaoSort {
    // 冒泡排序
    public static void main(String[] args) {

        int[] ns = {5, 4, 8, 9, 10, 22, 14, 1, 3, 5};
        for (int n : ns) {
            System.out.println(n);
        }


//        for (int i = 0; i < ns.length - 1; i++) {
//            for (int j = 0; j < ns.length- i - 1; j++) {
//                int temp = 0;
//                if (ns[j] > ns[j+1]) {
//                    temp = ns[j+1];
//                    ns[j+1] = ns[j];
//                    ns[j] = temp;
//                }
//            }
//
//        }
        Arrays.sort(ns);        // 系统自带的排序

        System.out.println("--------------");
        for (int n : ns) {
            System.out.println(n);
        }
    }
}
