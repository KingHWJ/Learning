public class ArrayDefine {
    // 数组定义

    public static void main(String[] args) {
        // 方式1
        int[] a1 = new int[5];
        boolean[] a2 = new boolean[5];
        double[] a3 = new double[5];
        System.out.println(a1[0]);
        System.out.println(a2[0]);
        System.out.println(a3[0]);

        // 方式2
        int[] a4 = new int[]{1,2,3,4,5,6};
        System.out.println(a4[0]);
        System.out.println(a4[3]);

        // 方式3
        double[] a5 = {2,32.2,1.4};
        for(int i=0;i<a5.length;i++){
            System.out.println(a5[i]);
        }

        a5[0] = 2.5;
        System.out.println(a5[0]);
    }

}
