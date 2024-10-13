package day08_stringManipulations;

import java.util.Scanner;

public class C4_replaceAll {

    public static void main(String[] args) {


        //kullanıcıdan isim soyisim ve kart numarasını alıp
        //aşagıdaki şekilde yazdırın
        //kart no : 1234 **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim =scanner.next();

        System.out.println("soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("kart numaranızı giriniz");
        String kartno =scanner.next();

        String yıldızlıısım = isim.substring(0,1).toLowerCase() +
                isim.substring(1). replaceAll("\\w","*");

        String yıldızlısoyısım = soyisim.substring(0,1).toLowerCase() +
                soyisim.substring(1).replaceAll("\\w" ,"*");

        String yıldızlıkartno = kartno.substring(0,4) + "**** **** ****";

        System.out.println("isim soyisim : "  + yıldızlıısım + " " + yıldızlısoyısım);
        System.out.println("kart no : " + yıldızlıkartno);



    }
}
