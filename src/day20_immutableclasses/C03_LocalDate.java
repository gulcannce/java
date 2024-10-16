package day20_immutableclasses;

import java.time.LocalDate;

public class C03_LocalDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate); //2024-10-16

        System.out.println(localDate.plusWeeks(10)); //2024-12-25

        System.out.println(localDate.plusMonths(4).plusDays(5)); //2025-02-21

        System.out.println(localDate.minusYears(3).minusMonths(2).minusDays(13));
         //2021-08-03

        System.out.println(localDate.withMonth(5)); //2024-05-16

        System.out.println(localDate.withDayOfYear(200)); //2024-07-18

        System.out.println(localDate.isLeapYear());

        LocalDate dogumtarihi1 = LocalDate.of(1996, 7, 12);
        LocalDate dogumtarihi2 = LocalDate.of(2000, 10, 10);

        System.out.println(dogumtarihi1.isLeapYear()); //true
        System.out.println(dogumtarihi2.isLeapYear()); //true

        System.out.println(dogumtarihi1.isBefore(dogumtarihi2)); //true
        System.out.println(dogumtarihi1.isAfter(dogumtarihi2)); //false

        System.out.println(localDate.lengthOfYear()); //366
        System.out.println(dogumtarihi1.lengthOfYear()); //366

        System.out.println(localDate.getDayOfYear()); // 290

    }
}
