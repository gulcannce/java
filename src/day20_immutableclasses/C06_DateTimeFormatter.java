package day20_immutableclasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C06_DateTimeFormatter {

    public static void main(String[] args) {

        /*

            yazdıgımız kodlarda zaman veya tarih ile ilgili islemlerde
            tarih veya zamanı istediğimiz formatta tutabilmek için
            DateTimeformatter Clas'ını kullanabiliriz
         */

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("dd MMM yyy EEE");

        System.out.println(ldt.format(istenenFormat)); //16 Eki 2024 Çar


    }
}
