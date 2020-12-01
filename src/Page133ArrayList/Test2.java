package JavaOca.src.Page133ArrayList;

import JavaDateAndTime.DateAndTime;

import java.time.*;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {


        String[] array = {"pen", "pencil"};// [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list\
        System.out.println(list.size());
        list.set(0, "rubber");
        array[0] = "new";
        array[1] = "hoba";

        for (String s : array) {
            System.out.println(s + " ");
        }

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        date1 = date1.plusMonths(10);
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(5,15);
        LocalDateTime dt1 = LocalDateTime.of(date2, time1);
        //System.out.println(dt1);
        dt1 = dt1.minusDays(22);
        System.out.println(dt1);
        dt1.plusDays(11);
        System.out.println(dt1.plusDays(11));


    }
}