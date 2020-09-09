import java.time.LocalDate;
import java.util.Date;

public class DateandDatetime {
    public static void main(String[] args) {
        Date deadline;
        Date birthday = new Date();
        deadline = new Date();
        deadline = birthday;
        String s = deadline.toString();
        System.out.println(s);

        Date d1 = new Date();
        System.out.println(d1);
        String d2 = d1.toString();
        System.out.println(d2);

        Date d3;
        LocalDate a = LocalDate.now();
        System.out.println(a);
        System.out.println(a.getYear());
        System.out.println(a.getMonth());
        System.out.println(a.getMonthValue());

        LocalDate b = LocalDate.of(1995,6,5);
        System.out.println(b);
        System.out.println(b.getDayOfMonth());



    }
}
