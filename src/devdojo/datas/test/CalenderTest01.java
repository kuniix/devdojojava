package devdojo.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo is the first day of week");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        calendar.add(Calendar.DAY_OF_MONTH, 2);
            calendar.add(Calendar.HOUR, 2);

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
