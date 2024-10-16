package day20_immutableclasses;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C05_LocalDateTime {

    public static void main(String[] args) {

       LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2024-10-16T22:32:37.302640

        // kullanıcıya zamanı 3 ekim 2023 salı seklinde yazdırın

        System.out.println(ldt.getDayOfMonth() + " "
                + ldt.getMonth() + " "
                + ldt.getYear() + " "
                + ldt.getDayOfWeek());

        //16 OCTOBER 2024 WEDNESDAY



    }
}
