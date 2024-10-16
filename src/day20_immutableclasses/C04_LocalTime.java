package day20_immutableclasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C04_LocalTime {

    public static void main(String[] args) {

        /*
           Localtime objesi canlı bir kronometre degıl
           olusturuldugu anda sistemin saat bilgisini kaydeden bir variable'dır.
         */

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //22:02:39.908475

        LocalTime turkiyesaati =LocalTime.now(ZoneId.of("Europe/Paris")).plusHours(1);

        System.out.println(turkiyesaati); //22:02:39.909209

        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(japonyaSaati); //04:02:39.910003

        System.out.println(localTime.toNanoOfDay()); //79359908475000

        //yuzbın ile 1 milyon arasındaki sayıların toplamını
        //ve toplama işleminin kaç nanosaniye surdugunu yazdirin

        System.out.println("loop basında localtime: " +localTime);
        LocalTime baslangıc = LocalTime.now();
        System.out.println("baslangıc :" + baslangıc);
        System.out.println("baslangıcta nano saniye :" + baslangıc.toNanoOfDay());

        long toplam = 0;

        for (int i = 100000; i <1000000 ; i++) {
            toplam += i;

        }
            System.out.println("toplam :" + toplam);
            System.out.println("loop sonunda locatime :" +localTime);
            LocalTime bitis = LocalTime.now();
            System.out.println("bitiş :" + bitis);
            System.out.println("bitiste nano saniye :" +bitis.toNanoOfDay());

        System.out.println("işlem suresi "+ (bitis.toNanoOfDay()-baslangıc.toNanoOfDay()));


        }




    }


