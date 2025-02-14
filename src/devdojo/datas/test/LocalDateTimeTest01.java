package devdojo.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDate date = LocalDate.of(2024, Month.JULY, 17);
//        LocalTime time = LocalTime.of(10,59,21);
//        System.out.println(localDateTime);

        LocalDate date = LocalDate.parse("2025-02-12");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
