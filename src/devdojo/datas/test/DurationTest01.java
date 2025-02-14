package devdojo.datas.test;

import devdojo.associacao.desafio.domain.Local;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusMinutes(7);

        System.out.println(now);
        System.out.println(nowAfterTwoYears);
        System.out.println(timeNow);
        System.out.println(timeMinus7Hours);

    }
}
