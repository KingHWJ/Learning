import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // 设置
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.DATE,9);
        c.set(1995,6,5);
        c.add(Calendar.YEAR,20);
        c.add(Calendar.DATE,-20);
        Date date = c.getTime();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)); // 西方月份0-11
        System.out.println(c.get(Calendar.DATE));
        System.out.println(date);

    }
}
