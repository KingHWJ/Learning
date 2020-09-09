import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        /*
        斗地主案例
        1.装牌
        2.洗牌
        3.发牌
        4.看牌
         */

        // 1.装牌
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] colors = {"♥️","♠️","♣️","️♦️️"};
        String[] nums = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (String color : colors) {
            for (String num : nums) {
//                System.out.println(color + num);
                poker.add(color + num);
            }
        }
        // 2.洗牌
        Collections.shuffle(poker);

        // 3.发牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if(i >= 51){
                dp.add(poker.get(i));
            }else if(i%3 == 0){
                p1.add(poker.get(i));
            }else if(i%3 == 1){
                p2.add(poker.get(i));
            }else if(i%3 == 2){
                p3.add(poker.get(i));
            }
        }

        // 4.看牌
        System.out.println("周杰伦：" + p1);
        System.out.println("周润发：" + p2);
        System.out.println("周星驰：" + p3);
        System.out.println("底牌：" + dp);



    }
}
