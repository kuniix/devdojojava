package devdojo.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusDays(23);

        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofMonths(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(now.until(now.plusDays(p3.getDays())));
    }
}
