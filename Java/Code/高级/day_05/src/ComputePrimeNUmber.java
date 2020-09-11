import java.util.ArrayList;

public class ComputePrimeNUmber {
    private int cnt = 0;
    private int show_num; // 计算多少以内的质数
    private ArrayList<Integer> num_list = new ArrayList<>();

    public ComputePrimeNUmber() {
    }

    @Override
    public String toString() {
        return "" + num_list;
    }

    public ComputePrimeNUmber(int show_num) {
        this.show_num = show_num;
    }

    public int compute() {
        long start_time = System.currentTimeMillis();
        // 添加标签
        label:
        for (int i = 2; i <= show_num; i++) {
            if (i == 2) {
                cnt++;
//                num_list.add(i);
            } else {
                if (i % 2 == 0)
                    continue ;
                // 计算是否有其他公约数，如果有直接重新循环
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        continue label;
                    }
                }
                cnt++;
//                num_list.add(i);
            }
        }
        long use_time = System.currentTimeMillis() - start_time;
        System.out.println("总用时：" + use_time + "豪秒");
        return cnt;
    }

    public static void main(String[] args) {

        ComputePrimeNUmber a = new ComputePrimeNUmber(20000000);
        System.out.println(a.compute());
//        System.out.println(a.toString());
//        System.out.println(a.num_list.size());
    }
}
