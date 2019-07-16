package JavaOca.src.Page145LocalDateTime;

import java.time.LocalDate;
import java.time.Month;

public class ZooTimerToy {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate finish = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, finish);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate finish) {
        LocalDate upTo = start;
        while (upTo.isBefore(finish)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
