public class ArrayMarket {
    // 数组遍历
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for(int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }

        int[] b = {5,15,2000,40000,100,30000};

        int max = b[0];
        for(int i =0;i<b.length;i++){
            if(b[i]>max){
                max = b[i];
            }
        }
        System.out.println(max);

        // 数组反转
        int[] c = {1,2,3,4,5};

        for(int minx = 0,max1= c.length -1;minx<= max1;minx++,max1--){
            int temp = c[max1];
            c[max1] = c[minx];
            c[minx] = temp;

        }


        for(int i = 0;i < c.length;i++){
            System.out.println(c[i]);
        }
    }
}
