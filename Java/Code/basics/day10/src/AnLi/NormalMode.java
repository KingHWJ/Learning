package AnLi;

import red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    // 普通模式的红包
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {

        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < list.size()-1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);

        return list;
    }
}
