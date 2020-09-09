import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalCalendar {
    // 当前日历
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();     // 当前日期
        System.out.println(d1);

        int month = d1.getMonthValue();     // 当前月份
        int day = d1.getDayOfMonth();       // 当前月第几天

        d1 = d1.minusDays(day - 1);         // 当月第一天
        DayOfWeek weekday = d1.getDayOfWeek();  // 当月第一天，在这一周是第几天
        int value = weekday.getValue();         // 周几对应的数字

//        System.out.println(month);
//        System.out.println(day);
//        System.out.println(d1);
//        System.out.println(weekday);
//        System.out.println(value);

        System.out.println("Mon Tue Wed Thur Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (d1.getMonthValue() == month) {
            System.out.printf("%3d", d1.getDayOfMonth());
            if (d1.getDayOfMonth() == day)
                System.out.print("*");
            else
                System.out.print(" ");
            d1 = d1.plusDays(1);
            if (d1.getDayOfWeek().getValue() == 1)
                System.out.println();
        }


    }
}
