import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class CalendarTrails {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR, 20);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        Date date = calendar.getTime();

        System.out.println(date);
    }
}
