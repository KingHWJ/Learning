import java.util.ArrayList;
import java.util.Random;

public class ArrayLIstTest6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);
        }

        System.out.println("大数据集为："+list);

        ArrayList<Integer> small = getSmall(list);

        System.out.println("其中的偶数数据为："+small);



    }

    public static ArrayList<Integer> getSmall(ArrayList<Integer> list){
        ArrayList<Integer> small = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                small.add(list.get(i));
            }
        }
        System.out.println("偶数个数为："+small.size());
        return small;
    }
}
