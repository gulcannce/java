package day8_stringManipulations;

import java.util.Scanner;

public class C8_StringManipulations {
    public static void main(String[] args) {

        //Soru 6 :kullanıcıdan bir String alın,
        //       Stringin uzunluğu cift sayı ise tam ortasına :) ekleyin,
        //       Stringin uzunluğu tek sayı ise ortadaki harfi silin ve yerine :( yazdırın.

        Scanner scanner = new Scanner( System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenMetin = scanner.nextLine();

         int uzunluk = girilenMetin.length();

         String yeniHal ="";

         if (uzunluk % 2 == 0 ) { // uzunluk cift sayı

             yeniHal=girilenMetin.substring(0,uzunluk/2) +
                     ":)";
             girilenMetin.substring(uzunluk/2);

         }else { //uzunluk tek ise
             yeniHal = girilenMetin.substring(0, uzunluk / 2) +
                     ":(" +
                     girilenMetin.substring((uzunluk + 1) / 2);

             System.out.println("yzdınız ve ben onu değiştirdim :" + yeniHal);
         }
    }


}
