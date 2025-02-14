package devdojo.locale.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeBR = new Locale("pt", "BR");
        Locale localeIndia = new Locale("hi", "IN");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);

        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Brasil " + df2.format(calendar.getTime()));
        System.out.println("India " + df3.format(calendar.getTime()));
    }
}
