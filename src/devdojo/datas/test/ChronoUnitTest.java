package devdojo.datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1998, Month.JULY, 17, 5,12,0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.HOURS.between(aniversario, now));
        System.out.println(ChronoUnit.MINUTES.between(aniversario, now));
        System.out.println(ChronoUnit.SECONDS.between(aniversario, now));
    }
}
