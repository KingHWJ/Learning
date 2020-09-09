import java.util.*;

public class DouDiZhu {
    // 斗地主
    public static void main(String[] args) {
        /*
        1.创建2个集合，存储牌色和数字
        2.创建1个map集合，存储牌和牌索引
        3.洗牌，Collections.shuffle 打乱
        4.发牌，没人17张牌，3张底牌
        5.展示牌
         */
        List<String> colors = List.of("♥️", "♦️", "♠️", "♣️");
        List<String> cards = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        // 拼牌
        int index = 0;
        HashMap<Integer, String> pokers = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        pokers.put(index, "大王");
        pokerIndex.add(index);
        index++;
        pokers.put(index, "小王");
        pokerIndex.add(index);
        index++;

        for (String card : cards) {
            for (String color : colors) {
                String poker = color + card;
                pokers.put(index, poker);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(pokers);
//        System.out.println(pokerIndex);

        // 洗牌
        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);

        // 发牌 (按牌索引发牌）
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> di = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            int in = pokerIndex.indexOf(i);
            if (in >= 51) {
                di.add(i);
            } else if (in % 3 == 0) {
                p1.add(i);
            } else if (in % 3 == 1) {
                p2.add(i);
            } else if (in % 3 == 2) {
                p3.add(i);
            }
        }

        // 排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(di);

        pokerShow("周杰伦", pokers, p1);
        pokerShow("王祖贤", pokers, p2);
        pokerShow("苍井空", pokers, p3);
        pokerShow("底牌", pokers, di);

    }

    public static void pokerShow(String name, HashMap<Integer, String> poker, ArrayList<Integer> index) {

        String str = name + "的牌：";

        for (Integer key : index) {
            str += poker.get(key);
            str += ", ";
        }
        System.out.println(str);

    }

}
